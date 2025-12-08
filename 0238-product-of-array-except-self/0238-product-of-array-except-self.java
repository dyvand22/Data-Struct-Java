class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;

        // Step 1: count zeros and compute product of non-zero elements
        for (int num : nums) {
            if (num == 0) zeroCount++;
            else product *= num;
        }

        int[] res = new int[nums.length];

        // Step 2: handle cases
        if (zeroCount > 1) {
            // Case: more than one zero → all outputs are zero
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 0) {
                // No zero → normal division
                res[i] = product / nums[i];
            } else {
                // Exactly one zero → only zero index gets product
                if (nums[i] == 0) {
                    res[i] = product; // product of all non-zero numbers
                } else {
                    res[i] = 0;
                }
            }
        }

        return res;
    }
}

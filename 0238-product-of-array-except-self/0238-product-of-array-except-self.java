class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zero = 0;
        int product = 1;
        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else {
                product *= num;
            }
        }

        // Case 1: more than one zero
        if (zero > 1) {
            return res; // all zeros
        }

        // Case 2: no zero
        if (zero == 0) {
            for (int i = 0; i < res.length; i++) {
                res[i] = product / nums[i];
            }
        }

        // Case 3: exactly one zero
        if (zero == 1) {
            for (int i = 0; i < res.length; i++) {
                if (nums[i] == 0) {
                    res[i] = product;
                } else {
                    res[i] = 0;
                }
            }
        }

        return res;
    }
}

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;                 // first maximum already counted
        int x = nums.length - 1;

        while (x > 0) {
            if (nums[x] != nums[x - 1]) {
                count++;

                if (count == 3) {
                    return nums[x - 1];
                }
            }
            x--;
        }

        // If less than 3 distinct elements exist
        return nums[nums.length - 1];
    }
}

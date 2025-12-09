class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxsum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];  // FIXED
            maxsum = Math.max(maxsum, sum);
        }

        return maxsum / k;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actsum = range*(range +1)/2;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];
        }
        int answer = actsum-sum;
        return answer;
    }
}
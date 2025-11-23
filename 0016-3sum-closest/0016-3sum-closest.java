class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int res = 0;
       int closest = Integer.MAX_VALUE;
       Arrays.sort(nums);
       for(int i = 0; i < nums.length-2; i++){
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[i]+nums[right]+nums[left];
            if(sum==target){
                return target;
            }
            else if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;

            }
            int diff = Math.abs(target-sum);
            if(closest>diff){
                closest=diff;
                res=sum;
            }
        }
       }
       return res;
    }
}

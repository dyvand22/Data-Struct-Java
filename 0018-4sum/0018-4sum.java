class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
      
        for(int i = 0;i< nums.length-3;i++){
            for(int j =i+1;j<nums.length-2;j++){
                  int left = j+1;
                  int right = nums.length-1;
                while(left<right){
                    long sum = (long)nums[i]+ nums[j]+nums[left]+nums[right];
                    if(target==sum){
                        set.add(Arrays.asList(nums[left],nums[right],nums[i],nums[j]));
                        left++;
                        right--;
                    }
                    if(sum<target) left++;
                    if(sum>target) right--;
                }
            }
        }
        return new ArrayList(set);
    }
}

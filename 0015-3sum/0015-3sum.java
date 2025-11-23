class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>set = new HashSet<>();
        
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-2; i++){
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
            int n = nums[left]+nums[right]+nums[i];
            if(n>0){
                right--;
            }
            else if(n<0){
                left++;
            }
            else if(n==0){
                set.add(Arrays.asList(nums[left],nums[right],nums[i]));
                left++;
                right--;
            }
        }
        }
        return new ArrayList<>(set);

        
    }
}
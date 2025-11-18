class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int n = nums.length;
        for(int right = 0; right<n; right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.getOrDefault(0,0)>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            max = Math.max(max,right-left+1);

        }
        return max;
        
    }
}
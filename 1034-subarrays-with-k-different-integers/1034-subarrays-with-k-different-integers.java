class Solution {

    public int countx(int[]nums,int k){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int start = 0;
        int end = 0;
        int count = 0;
        int n = nums.length;
        while(end<n){
            freq.put(nums[end],freq.getOrDefault(nums[end],0)+1);
            while(freq.size()>k){
                freq.put(nums[start],freq.get(nums[start])-1);
                if(freq.get(nums[start])==0){
                    freq.remove(nums[start]);
                }
                start++;
            }
            count = count + (end-start+1);
            end++;
        }
        return count;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countx(nums,k)-countx(nums,k-1);

        
    }

}
    

class Solution {
    public int maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int num : nums){
            if(num<min){
                min = num;
            }
            else{
                max= Math.max(max,num-min);
            }
        }
        return max;
        
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int ij = 0;
        for(int i =0; i< nums.length;i++){
            if(nums[i]!=0){
                nums[ij]=nums[i];
                ij++;
            }

        }
        while(ij<nums.length){
            nums[ij]=0;
            ij++;
        }

            
        
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int i = 0;
        while(i<=right){
            if(nums[i]==0){
                int temp = nums[left];
                nums[left]=0;
                nums[i]=temp;
                left++;
                i++;
            }
            else if(nums[i]==2){
                int temp2 = nums[right];
                nums[right]=2;
                nums[i]= temp2;
                right --;
            }
            else {
                i++;
            }
            
        }
        
    }
}
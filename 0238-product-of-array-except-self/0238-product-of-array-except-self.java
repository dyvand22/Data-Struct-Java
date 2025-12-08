class Solution {
    public int[] productExceptSelf(int[] nums) {
       int zeroz = 0;
       int product = 1;
       int [] res = new int [nums.length];
       for(int num : nums){
        if(num==0) zeroz++;
        else product *=num;
       }
       if(zeroz>1){
            return res;
        }

       for(int i = 0;i<nums.length;i++){
        if(zeroz ==0){
            res[i]=product/nums[i];

        }
        else if (zeroz == 1){
            if(nums[i]==0){
                res[i] = product;
            }else res[i]=0;
        }
       }
       return res;
    }
}

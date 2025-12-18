class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
       int max = 0;
       while(left<right){
        int area = 1;
        if(height[left]<height[right]){
            area = height[left]*(right-left);
            max = Math.max(max,area);
            left++;

        }if(height[right]<=height[left]){
            area = height[right]*(right-left);
            max= Math.max(max,area);
            right--;
        }
       }
       return max;
        
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxarea = 0;
        
        while(left<right){
            int area = 1;
            if(height[left]<height[right]){
                area = height[left]*(right-left);
                maxarea = Math.max(area,maxarea);
                left++;
            }
            if(height[right]<=height[left]){
                area = height[right]*(right-left);
                maxarea = Math.max(area,maxarea);
                right--;
            }
        }
        return maxarea;
        
    }
}
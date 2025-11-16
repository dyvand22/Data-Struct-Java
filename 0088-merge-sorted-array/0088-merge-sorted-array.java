class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m;
        int ptr2 = 0;
        while(ptr1<nums1.length && ptr2<n){
            nums1[ptr1]=nums2[ptr2];
            ptr1++;
            ptr2++;
        }
        Arrays.sort(nums1);
        
    }
}
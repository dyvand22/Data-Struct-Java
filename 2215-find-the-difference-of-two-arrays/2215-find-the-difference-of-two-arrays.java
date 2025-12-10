class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int x : nums1) set1.add(x);
        for(int x : nums2) set2.add(x);

        ArrayList<Integer> list1 = new ArrayList();
        for(int x : set1){
            if(!set2.contains(x)) list1.add(x);
        }
        ArrayList<Integer> list2 = new ArrayList();
        for(int x : set2){
            if(!set1.contains(x)) list2.add(x);
        }



        return Arrays.asList(list1,list2);



        
    }
}
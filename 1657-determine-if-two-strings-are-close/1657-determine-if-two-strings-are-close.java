class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char x : word1.toCharArray()) map1.put(x,map1.getOrDefault(x,0)+1);
        for(char x : word2.toCharArray()) map2.put(x,map2.getOrDefault(x,0)+1);

        if(!map1.keySet().equals(map2.keySet())) return false;

        List<Integer> list1 = new ArrayList(map1.values());
        List<Integer> list2 = new ArrayList(map2.values());

        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);

        
    }
}
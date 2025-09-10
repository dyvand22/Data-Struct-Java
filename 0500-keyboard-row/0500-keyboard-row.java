class Solution {
    private boolean cantype(String word, Set<Character> row){
        for(char c : word.toCharArray()){
            if(!row.contains(c)) return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();
        for(char c : "qwertyuiop".toCharArray()){
            row1.add(c);
        }

        for(char c : "asdfghjkl".toCharArray()){
            row2.add(c);
        }

        for(char c : "zxcvbnm".toCharArray()){
            row3.add(c);
        }


        List<String> result = new ArrayList<>();

        for (String word : words){
            String Lower = word.toLowerCase();

            if (cantype(Lower,row1)|| cantype(Lower,row2)|| cantype(Lower,row3)){
                result.add(word);
            }
        }

        return result.toArray(new String[0]);

        
    }
}
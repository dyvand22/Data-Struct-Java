class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() <= 2) {
                words[i] = word.toLowerCase();
            } else {
                words[i] = Character.toUpperCase(word.charAt(0)) + 
                          word.substring(1).toLowerCase();
            }
        }
        
        return String.join(" ", words);
    }
        

        
    
}
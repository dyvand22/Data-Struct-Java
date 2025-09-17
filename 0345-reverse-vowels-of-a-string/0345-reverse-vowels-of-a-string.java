class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character> vowels = new HashSet<>();
        for(char x : "aeiouAEIOU".toCharArray()){
            vowels.add(x);
        }

        char [] c = s.toCharArray();
        int left = 0; 
        int right = c.length-1;

        while (left<right){
            while(left<right && !vowels.contains(c[left])){
                left++;
            }

            while(left<right && !vowels.contains(c[right])){
                right--;
            }
            char temp = c[left];
            c[left]= c[right];
            c[right]= temp;

            left++;
            right--;
        }

        return new String(c);
        
    }
}
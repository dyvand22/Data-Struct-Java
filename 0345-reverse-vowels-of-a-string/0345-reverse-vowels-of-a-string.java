class Solution {
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String k) {
        char [] s = k.toCharArray();
        int left = 0;
        int right = s.length-1;
        while(left<right){
            while(left<right&& !isVowel(s[left])){
                left++;
            }
            while(left<right&& !isVowel(s[right])){
                right--;
            }

            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;

        }
        return new String(s);
        
        
    }
}
class Solution {
    private Boolean isVowel(char z){
        if(z=='a'||z=='e'|| z == 'i'|| z== 'o'|| z=='u'||z=='A'||z=='E'|| z == 'I'|| z== 'O'|| z=='U' ) return true;
        else return false;

    }
    
    public String reverseVowels(String k) {
        char [] x = k.toCharArray();
        int left = 0;
        int right = x.length-1;
        while(left<right){
            if(!isVowel(x[left])) left++;
            if(!isVowel(x[right])) right--;
            if(isVowel(x[left])==true&& isVowel(x[right])==true){
                char temp = x[left];
                x[left]=x[right];
                x[right]=temp;
                left++;
                right--;
            }

        }
        return new String(x);
        
        
        
    }
}
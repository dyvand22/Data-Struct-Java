class Solution {
    private Boolean isVow(char x){
        
        
       return x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U';
    
            
        
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxcount = 0;
        for(int i = 0; i<k;i++){
            if(isVow(s.charAt(i))) count++;
        }
        maxcount = count;
        for(int i = k;i<s.length();i++){
            if(isVow(s.charAt(i))) count++;
            if(isVow(s.charAt(i-k))) count--;
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
       
        
    }
}
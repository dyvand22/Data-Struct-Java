class Solution {
    public int minAddToMakeValid(String s) {
        //   (()))
        int open = 0;
        int closed = 0;
        for(char x : s.toCharArray()){
            if(x=='('){
                open++;

            }
            else if(x==')'&&open>0){
                open--;
            }
            else closed ++;
        }
        return open+closed;
    }
}
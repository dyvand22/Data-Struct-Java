class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> charstack = new Stack<>();
        Stack<Integer> numstack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k= (10*k)+(c-'0');
                continue;
            }
            if(c=='['){
                numstack.push(k);
                k = 0;
                charstack.push(sb);
                sb = new StringBuilder();
                
            } else if (c==']'){
                StringBuilder prev = charstack.pop();
                int repeat = numstack.pop();
                for(int i = 0; i < repeat;i++) prev.append(sb);
                sb=prev;
            }
            else{
                sb.append(c);
            }

        }

        return sb.toString();
        
    }
}
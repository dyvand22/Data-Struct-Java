class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(!stack.isEmpty()&& stack.peek()==x){
                stack.pop();
            }
            else stack.push(x);
        }
        StringBuilder sb = new StringBuilder();
        for(char x : stack){
            sb.append(x);
        }
        return sb.toString();
    }
}
class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack = new Stack<>();
       String[] parts = path.split("/");
       for(String p : parts){
        if(p.equals("")|| p.equals(".")){
            continue;
        }
        else if(p.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();

            }
            
        }
        else{
            stack.push(p);
        }
       }
       if(stack.isEmpty()){
        return "/";
       }
       StringBuilder sb = new StringBuilder();
       for(String dir: stack){
        sb.append("/").append(dir);
       }
       return sb.toString();


        
    }
}
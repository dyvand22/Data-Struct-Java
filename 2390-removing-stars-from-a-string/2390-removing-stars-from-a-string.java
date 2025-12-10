class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x=='*'&&!stack.isEmpty()){
                stack.pop();
            }else stack.push(x);
        }
        char [] arr = new char[stack.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i]=stack.pop();
        }

        int left = 0;
        int right = arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
        
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       Stack<int[]> stack = new Stack<>();
       stack.push(intervals[0]);
       
       for(int i = 1; i<intervals.length;i++){
        int [] last = stack.peek();
        if(last[1]>=intervals[i][0]){
            last[1]=Math.max(last[1],intervals[i][1]);
        }else{
            stack.push(intervals[i]);
        }

       }
       return stack.toArray(new int[stack.size()][]);

        
    }
}
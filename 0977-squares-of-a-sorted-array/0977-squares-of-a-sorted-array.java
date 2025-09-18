import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            ans.add(nums[i]*nums[i]);

        }

        Collections.sort(ans);

        int [] anss = ans.stream().mapToInt(Integer::intValue).toArray();
        return anss;



    }
}
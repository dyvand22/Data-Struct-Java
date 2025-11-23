class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                map.put(sum, diff);

                if (sum == target) return sum;
                else if (sum > target) right--;
                else left++;
            }
        }

        // find sum with minimum difference
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            if (map.get(key) < minDiff) {
                minDiff = map.get(key);
                closestSum = key;
            }
        }

        return closestSum;
    }
}

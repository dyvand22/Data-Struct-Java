class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else { 
                        // found one
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        // skip duplicates for left
                        while (left < right && nums[left] == nums[left - 1]) left++;

                        // skip duplicates for right
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

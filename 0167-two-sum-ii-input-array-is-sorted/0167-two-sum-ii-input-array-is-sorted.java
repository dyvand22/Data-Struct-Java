class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                res[0] = map.get(complement) + 1; // 1-indexed
                res[1] = i + 1;
                return res;
            }

            map.put(numbers[i], i);
        }

        return res; // will never reach here for valid input
    }
}

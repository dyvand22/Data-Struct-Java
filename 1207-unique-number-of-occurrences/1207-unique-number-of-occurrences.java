class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // Step 1: count occurrences using HashMap
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Step 2: store frequencies in a HashSet
        Set<Integer> set = new HashSet<>(freq.values());

        // if sizes differ → duplicate frequencies exist
        return set.size() == freq.size();
    }
}

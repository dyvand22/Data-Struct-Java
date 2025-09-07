import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check ransomNote chars
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;  // Not enough chars
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}

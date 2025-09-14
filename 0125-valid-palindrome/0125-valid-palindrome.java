import java.util.stream.*;

class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return IntStream.range(0, cleaned.length()/2)
            .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length()-1-i));
    }
}

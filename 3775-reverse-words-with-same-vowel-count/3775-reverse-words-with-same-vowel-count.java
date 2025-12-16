class Solution {

    private int counter(String s) {
        int count = 0;
        for (char x : s.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                count++;
            }
        }
        return count;
    }

    public String reverseWords(String s) {

        String[] str = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        // store word -> vowel count
        for (String x : str) {
            map.put(x, counter(x));
        }

        // vowel count of first word
        int firstCount = map.get(str[0]);

        // reverse words with same vowel count
        for (int i = 1; i < str.length; i++) {
            if (map.get(str[i]) == firstCount) {
                str[i] = new StringBuilder(str[i]).reverse().toString();
            }
        }

        // build result
        String ans = "";
        for (int i = 0; i < str.length; i++) {
            ans += str[i];
            if (i < str.length - 1) ans += " ";
        }

        return ans;
    }
}

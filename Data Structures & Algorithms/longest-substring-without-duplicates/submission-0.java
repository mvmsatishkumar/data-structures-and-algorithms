class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int max = 0;
        while (j < len) {

            char c = s.charAt(j);
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                char left = s.charAt(i);
                set.remove(left);
                i++;

            }

        }

        return max;
    }
}
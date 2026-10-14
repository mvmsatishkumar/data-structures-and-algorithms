class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            check += (int) s.charAt(i);
            check -= (int) t.charAt(i);
        }

        if (check == 0) return true;
        else return false;
    }
}

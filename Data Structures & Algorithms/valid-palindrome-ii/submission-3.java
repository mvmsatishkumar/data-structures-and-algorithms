class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        int l = 0, r = len - 1;

        boolean flag = true;
        while (l < r) {
            char c1 = s.charAt(l);
            char c2 = s.charAt(r);
            if (c1 != c2) {
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            }
            r--;
            l++;
        }

        return true;
    }

    boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
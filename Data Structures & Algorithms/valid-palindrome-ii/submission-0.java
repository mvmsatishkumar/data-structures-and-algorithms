class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        int l = 0, r = len - 1;

        boolean flag = true;
        while (l < r) {
            char c1 = s.charAt(l);
            char c2 = s.charAt(r);
            if (c1 != c2) {
                if (flag) {
                    if (s.charAt(l + 1) == c2)
                        l++;
                    else if (s.charAt(r - 1) == c1)
                        r--;
                } else return false;

                flag = false;
            }
            r--;
            l++;
        }

        return true;
    }
}
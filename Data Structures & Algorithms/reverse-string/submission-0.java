class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length;
        int l = 0, r = len - 1;
        while (l < len / 2) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++; r--;
        }
    }
}
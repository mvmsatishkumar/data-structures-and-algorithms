class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                // Compare after converting to lowercase
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}

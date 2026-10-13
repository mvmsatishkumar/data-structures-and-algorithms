class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqArray = new int[26];
        int left = 0, maxFreq = 0, longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freqArray[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freqArray[ch - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freqArray[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(right - left + 1, longest);
        }
        return longest;

    }
}
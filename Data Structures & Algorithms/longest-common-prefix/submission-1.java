class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int len = strs.length;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        int i = 0;
        for (char ch : strs[len - 1].toCharArray()) {
            
            if (i == strs[0].length()) break;
            if (strs[0].charAt(i) == ch) {
                sb.append(ch);
                i++;
            } else break; 
        }

        return sb.toString();
    }
}
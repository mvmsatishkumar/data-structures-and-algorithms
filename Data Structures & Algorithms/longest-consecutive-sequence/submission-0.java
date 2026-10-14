class Solution {
    public int longestConsecutive(int[] nums) {
        
        boolean[] mark = new boolean[1001];
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            mark[nums[i]] = true;
        }

        int count = 0;
        for (int i = 0; i < 1001; i++) {
            if (mark[i] == true) max = Math.max(max, ++count);
            else count = 0;
        }

        return max;
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
        int i = 0;
        int sum = 0;
        int minL = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            
            sum += nums[j];
            while (sum >= target) {
                minL = Math.min(minL, j - i + 1);
                sum -= nums[i];
                i++;
            }
            
        }

        return minL == Integer.MAX_VALUE ? 0 : minL;
    }
}
class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        int maxL = 0, maxR = 0;
        for (int i = 0; i < n; i++) {
            maxLeft[i] = maxL;
            maxL = Math.max(maxL, height[i]);

            maxRight[n - i - 1] = maxR;
            maxR = Math.max(maxR, height[n - i - 1]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int water  = Math.min(maxLeft[i], maxRight[i]);
            totalWater += (water - height[i] > 0) ? water - height[i] : 0;
        }

        return totalWater;
    }
}
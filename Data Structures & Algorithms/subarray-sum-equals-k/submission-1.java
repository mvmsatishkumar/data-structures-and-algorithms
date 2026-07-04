class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int n = nums.length;
        int preSum = 0;
        int count = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            preSum += nums[j];
            count += map.getOrDefault(preSum - k, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}
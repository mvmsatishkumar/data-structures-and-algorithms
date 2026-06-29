class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (hm.containsKey(target - n)) {
                return new int[]{hm.get(target-n), i};
            }

            hm.put(n, i);
        }

        return new int[]{0,1};
    }
}

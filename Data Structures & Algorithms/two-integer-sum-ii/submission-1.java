class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int[] ans = new int[2];

        int l = n - 1;
        int r = 0;
        while (r < n - 1) {
            int sum = numbers[r] + numbers[l];
            if (sum == target) {
                ans[0] = r + 1;
                ans[1] = l + 1;
                break;
            }
            else if (sum < target) {
                r++;
            } else l--;
        }

        return ans;
    }
}

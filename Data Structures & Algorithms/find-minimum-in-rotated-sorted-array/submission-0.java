class Solution {
    public int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (nums[low] < nums[mid] && nums[mid] < nums[high]) high = mid - 1;
            else low = mid + 1; 
        }
        return nums[high - 1];
    }
}

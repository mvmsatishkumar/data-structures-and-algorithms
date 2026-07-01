class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0, high = nums.length - 1;
        int mid = low;
        while (mid <= high) {

            if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;  
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                mid++;
                low++;
            }
        }
    }
}
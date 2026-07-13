class Solution {
    public int[] sortArray(int[] nums) {
        
        int[] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);
        return nums;
    }

    public void sort(int[] nums, int low , int high, int[] temp) {

        if (low >= high) return;
        
        int mid = (low + high) / 2;
        sort(nums, low, mid, temp);
        sort(nums, mid + 1, high, temp);

        merge(nums, low, mid, high, temp);
    }

    public void merge(int[] nums, int low, int mid, int high, int[] temp) {

        int left = low, right = mid + 1;
        int idx = low;

        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp[idx++] = nums[left++];
            }
            else
                temp[idx++] = nums[right++];
        }

        while (left <= mid) temp[idx++] = nums[left++];
        while (right <= high) temp[idx++] = nums[right++];

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i];
        }
    }
}
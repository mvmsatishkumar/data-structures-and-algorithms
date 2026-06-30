class Solution {
    public int[] sortArray(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    public int[] sort(int[] nums, int low, int high) {
        if (low >= high)
            return nums;

        int pIndex = partition(nums, low, high);
        sort(nums, low, pIndex - 1);
        sort(nums, pIndex + 1, high);

        return nums;
    }

    int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low + 1;
        int j = high;
        while (true) {
            while (i <= high && nums[i] <= pivot) i++;
            while (j >= low && nums[j] > pivot) j--;

            if (i >= j)
                break;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}
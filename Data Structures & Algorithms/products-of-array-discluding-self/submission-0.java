class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        int product = 1;
        boolean flag = false;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                flag = true;
                index = i;
                continue;
            }
            product *= nums[i];
        }
        if (flag == true) {
            result[index] = product;
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = product;
            result[i] = temp / nums[i];
        }

        return result;
    }
}  

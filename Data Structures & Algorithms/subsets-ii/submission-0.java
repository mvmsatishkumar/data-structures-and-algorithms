class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        subsets(0, nums, list, ans);
        return ans;
    }

    void subsets(int i, int[] nums, List<Integer> list, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));
        if (i == nums.length) {
            return;
        }

        for (int j = i; j < nums.length; j++) {

            if (j > i && nums[j] == nums[j - 1]) continue;

            list.add(nums[j]);
            subsets(j + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }

        return;
    }
}
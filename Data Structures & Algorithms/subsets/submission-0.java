class Solution {

    void sets(int i, int[] nums, List<Integer> list, List<List<Integer>> ans) {

        if (i == nums.length) {
            ans.add(new ArrayList(list));
            return;
        }

        list.add(nums[i]);
        sets(i + 1, nums, list, ans);
        list.remove(list.size() - 1);

        sets(i + 1, nums, list, ans);

        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        sets(0, nums, list, ans);
        return ans;
    }
}
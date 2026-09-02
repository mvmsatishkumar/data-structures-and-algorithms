class Solution {

    void combination(int i, int sum, int[] candidates, int t, ArrayList<Integer> list, List<List<Integer>> ans) {

        if (sum >= t || i == candidates.length) {
            if (sum == t)
                ans.add(new ArrayList(list));
            return;
        }

        list.add(candidates[i]);
        combination(i, sum + candidates[i], candidates, t, list, ans);
        list.remove(list.size() - 1);

        combination(i + 1, sum, candidates, t, list, ans);

        return;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        combination(0, 0, candidates, target, list, ans);
        return ans;
    }
}
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        combination(0, 0, candidates, list, ans, target);

        return ans;
    }

    void combination(int i, int sum, int[] arr, ArrayList<Integer> list, List<List<Integer>> ans, int t) {

        if (sum >= t || i == arr.length) {
            if (sum == t)
                ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < arr.length; j++) {
            
            if (j > i && arr[j] == arr[j - 1]) continue;
            if (sum + arr[j]> t) break;

            list.add(arr[j]);
            combination(j + 1, sum + arr[j], arr, list, ans, t);
            list.remove(list.size() - 1);
        }
        return;
    }
}
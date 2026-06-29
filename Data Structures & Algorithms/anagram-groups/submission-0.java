class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);

            if (map.containsKey(sorted)) map.get(sorted).add(str);
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}

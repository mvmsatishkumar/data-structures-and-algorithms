class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);


        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char cNext = s.charAt(i + 1);

            if (val.get(c) >= val.get(cNext)) {
                res += val.get(c);
            }
            else res -= val.get(c); 
        }
        res += val.get(s.charAt(s.length() - 1));


        return res;        
    }
}
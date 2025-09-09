class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);

        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = val.get(s.charAt(i));

            if (cur < prev) {
                ans -= cur;   // subtract smaller before bigger
            } else {
                ans += cur;   // otherwise add
            }

            prev = cur; // update last seen value
        }
        return ans;
    }
}
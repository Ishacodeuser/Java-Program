class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s + s;

        int flip0 = 0, flip1 = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {

            char expected0 = (i % 2 == 0) ? '0' : '1';
            char expected1 = (i % 2 == 0) ? '1' : '0';
            if (str.charAt(i) != expected0) flip0++;
            if (str.charAt(i) != expected1) flip1++;
            if (i >= n) {
                char prev = str.charAt(i - n);
                char prevExp0 = ((i - n) % 2 == 0) ? '0' : '1';
                char prevExp1 = ((i - n) % 2 == 0) ? '1' : '0';

                if (prev != prevExp0) flip0--;
                if (prev != prevExp1) flip1--;
            }
            if (i >= n - 1) {
                ans = Math.min(ans, Math.min(flip0, flip1));
            }
        }
        return ans;
    }
}
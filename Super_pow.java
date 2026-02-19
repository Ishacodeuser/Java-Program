class Solution {

    static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        return helper(a % MOD, b, b.length - 1);
    }

    private int helper(int a, int[] b, int index) {

        if (index < 0) {
            return 1;
        }

        // Step 1: compute a^(last digit)
        int part1 = power(a, b[index]);

        // Step 2: compute (remaining part)^10
        int part2 = power(helper(a, b, index - 1), 10);

        return (part1 * part2) % MOD;
    }

    // Fast power function (a^k % MOD)
    private int power(int a, int k) {

        int result = 1;
        a %= MOD;

        while (k > 0) {
            if ((k & 1) == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            k >>= 1;
        }

        return result;
    }
}

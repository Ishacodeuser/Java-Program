public class Solution {
    public int mirrorReflection(int p, int q) {
        int lcm = lcm(p, q);

        int m = lcm / p;  
        int n = lcm / q;  

        if (m % 2 == 0) return 2;
        if (n % 2 == 0) return 0;
        return 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
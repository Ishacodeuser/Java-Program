package JavaProgram;
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

public class PowerOfTwoTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
    
        int[] testValues = {1, 2, 3, 4, 5, 8, 16, 18, 32, 64, 100};

        for (int n : testValues) {
            boolean result = solution.isPowerOfTwo(n);
            System.out.println(n + " is power of two? " + result);
        }
    }
}

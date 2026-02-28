public class Solution {
    public boolean completePrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public boolean isCompletePrimeNumber(int num) {
        String strNum = Integer.toString(num);  

        for (int i = 1; i <= strNum.length(); i++) {
            int prefix = Integer.parseInt(strNum.substring(0, i));
            if (!completePrime(prefix)) {  
                return false; 
            }
        }
        for (int i = 0; i < strNum.length(); i++) {
            int suffix = Integer.parseInt(strNum.substring(i));
            if (!completePrime(suffix)) {  
                return false; 
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 233;  
        if (sol.isCompletePrimeNumber(num)) {
            System.out.println(num + " is a Complete Prime Number.");
        } else {
            System.out.println(num + " is NOT a Complete Prime Number.");
        }
    }
}
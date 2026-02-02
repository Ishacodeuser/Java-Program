package JavaProgram;
public class uglyNumber{
    public static void main(String[] args){
        int n =6;
        System.out.println(UglyNumber(n));
    }
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                return false;
            }
        }package JavaProgram;

public class uglyNumber {
    public static void main(String[] args) {
        int n =6;
        System.out.println(isUgly(n));
    }
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }

        return true;
    }
}

        return true;
    }
}

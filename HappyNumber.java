import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1) {
            if (seen.contains(n)) {
                return false; 
            }
            seen.add(n);
            n = sumOfSquares(n);
        }
        
        return true; 
    }
    
    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Happy: ");
        int number = sc.nextInt();  

        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number!");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
    }
}

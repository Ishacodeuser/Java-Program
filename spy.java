package JavaProgram;

import java.util.Scanner;  

public class SpyNumber {
    public static void main(String[] arg) {

        int n, sum = 0, prod = 1;
        int d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n > 0) {
            d = n % 10;
            sum = sum + d;
            prod = prod * d;
            n = n / 10;
        }

        if (sum == prod) {
            System.out.println("Given number is a spy number.");
        } else {
            System.out.println("Given number is not a spy number.");
        }

        sc.close();  
    }
}

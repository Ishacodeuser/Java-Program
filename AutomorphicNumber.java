package JavaProgram;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] arg) {

        int n, num, square;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        num = n;
        square = n * n;

        System.out.println("Square of " + n + " is " + square);
        int divisor = 1;
        while (num > 0) {
            divisor = divisor * 10;
            num = num / 10;
        }
        if (square % divisor == n) {
            System.out.println(n + " is an Automorphic number.");
        } else {
            System.out.println(n + " is not an Automorphic number.");
        }

        sc.close();
    }
}

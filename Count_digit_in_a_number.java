package JavaProgram;
import java.util.Scanner;

public class CountTheDigitInANumber {
    public static void main(String[] args) {
        int num;
        int count=0;
        Scanner sc=newScanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        while(num!=0) {
            num=num/10;
            count++;
        }
        System.out.print("Total digit is:"+count);
    }
}
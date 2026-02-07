package JavaProgram;
import java.util.Scanner;

public class ValidNumber {

    public static boolean isNumber(String s) {
        if (s == null) return false;

        s = s.trim();
        String regex = "[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNumber(input)) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}

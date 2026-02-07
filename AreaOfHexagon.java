package JavaProgram;
import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the hexagon: ");
        double side = sc.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
        System.out.println("Area of the hexagon is: " + area);

        sc.close();
    }
}

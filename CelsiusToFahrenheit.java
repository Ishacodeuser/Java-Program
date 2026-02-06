package JavaProgram;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main (String[] args) {
        float celsius,fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        celsius=sc.nextFloat();
        fahrenheit=(celsius*9/5)+332;
        System.out.println("Temperature in Fahrenheit is:"+fahrenheit+ "F");
    }
}
package JavaProgram;
import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[]args){
        int num;
        int temp;
        int sum;
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
        sum=0;
        temp=num;
        while(num>0) {
            n=num%10;
            num=num/10;
            sum=sum+(n*n*n);
        }
        if(sum==temp){
            System.out.print(temp+ "is an armstrong number.");
        } else{
            System.out.print(temp+ "is not an armstrong number.");
        }
    }
}
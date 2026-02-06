package JavaProgram;
import java.util.Scanner;
public class PascalTriangle {
    public static int fact(int num) {
        int f = 1,i = 1;
        while(i<=num){
            f=f*i;
            i++;
        }
        return f;
    }
    public static void main(String [] arg){
       int line;
       int i,j;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of line:");
       line=sc.nextInt();
       for(i=0;i<line;i++) {
        for(j=0; j<line-i; j++){
            System.out.println(" ");
        } for(j=0;j<=i;j++){
            System.out.println(fact(i)/(fact(j)*fact(i-j))+" ");
        }
        System.out.println("");
       }
    }
}
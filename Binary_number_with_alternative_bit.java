public class AlternatingBits {

    public static boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 5; 
        System.out.println(hasAlternatingBits(num)); 
    }
}

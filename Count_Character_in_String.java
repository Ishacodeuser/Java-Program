package JavaProgram;

public class CountCharacter {
    public static void main(String[] args) {

        System.out.println("1.using length");
        String str = "Hello";
        System.out.println("String : " + str);
        int count = str.length();
        System.out.println("String length : " + count);

        System.out.println("2.Using ToCharArray");
        String str2 = "Maurya";
        int count2 = 0;
        for (char c : str2.toCharArray()) {
            count2++;
        }
        System.out.println("Number of the character: " + count2);

        System.out.println("3.Using excluding space");
        String str3 = "Hello";
        int count3 = 0;
        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) != ' ') {   
                count3++;
            }
        }
        System.out.println("Number of char: " + count3);
    }
}

// Print ASCII code of each character of a string.
public class reverseString1 {
    public static void main(String[] args) {
      //  String str = "Its simple";


     /*   for( i = 0; i< str.length(); i++)
        {
            char c = str.charAt(i);
            System.out.println(c+ " "+(int)c);
        }
    }
}*/

        // Print only Uppercase characters of a string
        /*for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                System.out.println(c);
            }
        }*/


        // Count the uppercase and lowercase character of a string.
        /*int count = 0, count1 = 0;
        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c))
                count++;
            if(Character.isLowerCase(c))
                count1++;
        }
        System.out.println(count+"Upper");
        System.out.println(count1+"Lower");*/


        // Create a new string containing only uppercase characters.
        /*int i;
        for (i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(Character.isUpperCase(c))
                str = str + c;
        }
        System.out.println("Str");*/


        // Create a string with digits first and then character
        /*StringBuilder digits = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        for (int i =0; i < str.length();i++)
        {
            char c = str.charAt(i);
            if (Character.isDigit(c))
            {
                digits.append(c);
            }
            else{
               characters.append(c);
            }
        }
        String result = digits.toString() + characters.toString();
        System.out.println(result);*/


        // Write a program to reverse the case of string
   /*     String result = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                result = result + Character.toLowerCase(c);
            }
            else{
                result = result + Character.toUpperCase(c);
            }
            System.out.println(result);
        }*/
        // Write a program to find the reverse of the string
        /*String rev = "";
        for (int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);*/


        // Write a program to find if a string is palindrome or not?
        /* String = "121";
        int i;
        String rev = "";
        for (i =0; i < str.length(); i++){
            char c = str.charAt(i);
            rev = c + rev;
        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("yes the given string is palindrome");
        }
        else
        {
            System.out.println("No the given string is not a palindrome");
        }*/


        // String encoding program  - Piglatin
        /*String str = "EAT";
        String pl = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            char u = Character.toUpperCase(c);
            if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U'  ){
                if (i == 0){
                    pl = str + "WAY";
                }else{
                    pl = str.substring(i) + str.substring(0,i) + "WAY";
                    break;
                }
            }
        }
       System.out.println("Piglatin Word:"+pl);*/

        // Create a word encoding program which moves which letter by 2. e.g. A become C , B become D , Y become A and so on
        String str= "SIMPLY";
        String encodedStr= "";
        for (int i = 0;i < str.length(); i++){
            char c = str.charAt(i);
            if( Character.isUpperCase(c)){
                c = (char )((c - 'A'+2) % +'A' );
            }
            else if (Character.isLowerCase(c)){
                c = (char) ((c - 'a'+2)% +'a');
            }
            encodedStr += c;
        }
        System.out.println("Original string:" + str);
        System.out.println("Encoded String:" + encodedStr);
    }
}


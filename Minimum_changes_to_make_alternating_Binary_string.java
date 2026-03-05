public class Solution {
    public static int minOperations(String s) {
        int countStartWith0 = 0;
        int countStartWith1 = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(i % 2 == 0) {
                if(current != '0')
                    countStartWith0++;
            } else {
                if(current != '1')
                    countStartWith0++;
            }
            if(i % 2 == 0) {
                if(current != '1')
                    countStartWith1++;
            } else {
                if(current != '0')
                    countStartWith1++;
            }
        }
        return Math.min(countStartWith0, countStartWith1);
    }
}
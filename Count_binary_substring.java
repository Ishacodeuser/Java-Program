class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int prevCount = 0;
        int currCount = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currCount++;
            } else {
                result += Math.min(prevCount, currCount);
                prevCount = currCount;
                currCount = 1;
            }
        }

        return result + Math.min(prevCount, currCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] testCases = {
            "00110011",  
            "10101",      
            "000111",     
            "01",         
            "00110",      
            "0000",       
            "11110000",   
            "01010101"    
        };

        for (String test : testCases) {
            int result = sol.countBinarySubstrings(test);
            System.out.println("Input: " + test + " -> Output: " + result);
        }
    }
}

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        testCase(solution, "the sky is blue");
        testCase(solution, "  hello   world  ");
        testCase(solution, "hello");
        testCase(solution, "");
        testCase(solution, "     ");
        testCase(solution, "a   good   example");
        testCase(solution, "Hi! How are you?");
    }
    private static void testCase(Solution solution, String input) {
        System.out.println("Original: \"" + input + "\"");
        String reversed = solution.reverseWords(input);
        System.out.println("Reversed: \"" + reversed + "\"");
    }
}

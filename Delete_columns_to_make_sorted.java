public class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;       
        int m = strs[0].length();   
        int deleteCount = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                char prev = strs[i - 1].charAt(j);
                char curr = strs[i].charAt(j);
                if (curr < prev) {
                    deleteCount++;
                    break;  
                }
            }
        }
        return deleteCount;
    }
}
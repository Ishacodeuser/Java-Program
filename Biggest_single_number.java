import java.util.HashMap;
import java.util.Map;

class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        int max = -1;
        for (int num : frequency.keySet()) {
            if (frequency.get(num) == 1) {
                max = Math.max(max, num);
            }
        }
        
        return max;
    }
}
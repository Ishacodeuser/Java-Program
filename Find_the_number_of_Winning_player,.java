class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            
            map.putIfAbsent(player, new HashMap<>());
            Map<Integer, Integer> colorMap = map.get(player);
            
            colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);
        }
        
        int winners = 0;
        for (int player = 0; player < n; player++) {
            
            if (!map.containsKey(player)) continue;
            
            Map<Integer, Integer> colorMap = map.get(player);
            
            for (int count : colorMap.values()) {
                if (count >= player + 1) {
                    winners++;
                    break;  
                }
            }
        }
        
        return winners;
    }
}
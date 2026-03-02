class Solution {
    public int minPartitions(String n) {
        char maxCh = '0';

        for(int i = 0; i<n.length(); i++){
            maxCh = (char) Math.max(maxCh, n.charAt(i));
        }
        return maxCh - '0';
    }
}
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count =0;
        int len = s.length();

        for(int i = 0; i<=len-k; i++){
            int sub = Integer.parseInt(s.substring(i,i+k));
            if(sub != 0 && num % sub == 0) {
                count++;
            }
        }
        return count;
    }
}
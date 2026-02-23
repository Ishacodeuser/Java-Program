class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set= new HashSet<>();
        int n = s.length();
        int codes = 1 << k;

        for(int i = k; i<=n; i++){
            String str = s.substring(i-k,i);
            if(!set.contains(str)){
                set.add(str);
                codes--;
            }
            if(codes==0){
                return true;
            }
        }
        return false;
    }
}
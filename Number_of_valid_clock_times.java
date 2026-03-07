class Solution {
    public int countTime(String time) {
        int count = 0;
        for(int h =0; h<24; h++){
        for(int m = 0; m<60; m++){
            String t = String.format("%02d:%02d", h,m);
            boolean valid = true;
            for(int i =0 ; i<5; i++){
                if(time.charAt(i) != '?' && time.charAt(i) != t.charAt(i)){
                    valid = false;
                    break;
                }
            }
            if(valid)
             count++;
        }
    }
    return count;
}
}
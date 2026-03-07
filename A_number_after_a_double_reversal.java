class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num<10) return true;
        int reversed1 = reverse(num);
        int reversed2 = reverse(reversed1);
        return num == reversed2;
    }
    
    private int reverse(int n) {
        String s = String.valueOf(Math.abs(n));
        StringBuilder sb = new StringBuilder(s);
        String reversedStr = sb.reverse().toString();
        int result = Integer.parseInt(reversedStr);
        return n < 0 ? -result : result;
    }
}
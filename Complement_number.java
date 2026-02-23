class Solution {
    public int findComplement(int num) {
        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1; 
        }
        return num ^ mask;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findComplement(5));  
        System.out.println(sol.findComplement(1));  
        System.out.println(sol.findComplement(10)); 
    }
}
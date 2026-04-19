class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());

        chars.sort((a,b)->{
            int cmp = freq.get(b) - freq.get(a);
            if(cmp != 0) return cmp;
            return a-b;
        });

        StringBuilder sb = new StringBuilder();
        for(char ch : chars){
            int count = freq.get(ch);
            for(int i = 0; i< count; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
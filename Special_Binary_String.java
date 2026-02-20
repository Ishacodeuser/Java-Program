class Solution {
    public String makeLargestSpecial(String s) {
        List<String> Specials = new ArrayList<> ();
        int start = 0;
        int sum =0;
        for(int i = 0; i<s.length(); i++){
            sum += s.charAt(i) == '1' ? 1 : -1;
            if(sum == 0) {
                String inner = s.substring(start + 1, i);
                Specials.add("1" + makeLargestSpecial(inner)+"0");
                start = i+1;
            }
        }
     Collections.sort(Specials, Collections.reverseOrder());


        StringBuilder result = new StringBuilder();
        for(String str : Specials){
            result.append(str);
        }
        return result.toString();
    }
}
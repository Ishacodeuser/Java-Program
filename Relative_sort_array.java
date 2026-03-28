public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            pos.put(arr2[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int x : arr1) {
            list.add(x);
        }
        list.sort((a, b) -> {
            boolean inA = pos.containsKey(a);
            boolean inB = pos.containsKey(b);

            if (inA && inB) {
                return pos.get(a) - pos.get(b);
            } else if (inA) {
                return -1;
            } else if (inB) {
                return 1;
            } else {
                return a - b;
            }
        });
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
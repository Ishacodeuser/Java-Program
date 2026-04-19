class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> flips = new ArrayList<>();
        int n = arr.length;

        for (int last = n - 1; last > 0; last--) {
            int target = last + 1;
            int pos = -1;
            for (int i = 0; i <= last; i++) {
                if (arr[i] == target) {
                    pos = i;
                    break;
                }
            }
            if (pos < last) {
                if (pos > 0) {
                    flip(arr, pos);
                    flips.add(pos + 1);
                }
                flip(arr, last);
                flips.add(last + 1);
            }
        }
        return flips;
    }
    private void flip(int[] arr, int end) {
        int left = 0;
        int right = end;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
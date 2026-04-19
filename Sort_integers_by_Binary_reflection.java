class Solution {
    public int binaryReflection(int n) {
        int result = 0;

        while (n > 0) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }

        return result;
    }

    public int[] sortByReflection(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int refA = binaryReflection(a);
            int refB = binaryReflection(b);

            if (refA != refB) {
                return refA - refB;
            } else {
                return a - b;
            }
        });

        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
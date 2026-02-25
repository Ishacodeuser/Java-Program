import java.util.*;

public class SortByBits {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 7, 10, 14};

        Arrays.sort(arr, (a, b) -> {
            int bitCompare = Integer.compare(Integer.bitCount(a), Integer.bitCount(b));
            if (bitCompare != 0) {
                return bitCompare; 
            }
            return Integer.compare(a, b); 
        });

        System.out.println(Arrays.toString(arr));
    }
}
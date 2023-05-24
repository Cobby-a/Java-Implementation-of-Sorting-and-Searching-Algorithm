import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public int binary_Search(int[] numbers, int key) {
        int high = numbers.length - 1;
        int low = 0;
        int mid;

        while (high >= low) {
            mid = ((high) + low) / 2;
            if (numbers[mid] < key) {
                low = mid + 1;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


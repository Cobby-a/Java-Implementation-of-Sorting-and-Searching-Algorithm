import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    int part(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[end];
        numbers[end] = temp;
        return (i + 1);
    }

    void quick_Sort(int[] numbers, int start, int end) {
        if (start < end) {
            int p = part(numbers, start, end);
            quick_Sort(numbers, start, p - 1);
            quick_Sort(numbers, p + 1, end);
        }
    }
}

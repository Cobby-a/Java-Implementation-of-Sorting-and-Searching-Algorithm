import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    void insertion_Sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int list = numbers[i];
            int j = i - 1;
            while ((j > -1) && (numbers[j] > list)) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = list;
        }
    }
}

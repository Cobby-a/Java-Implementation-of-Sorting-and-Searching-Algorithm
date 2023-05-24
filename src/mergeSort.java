import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

    void merge_Sort(int[] numbers, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];
        for (i = 0; i < n1; i++)
            LeftArray[i] = numbers[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = numbers[mid + 1 + j];
        i = 0;
        j = 0;
        k = beg;
        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                numbers[k] = LeftArray[i];
                i++;
            } else {
                numbers[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            numbers[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            numbers[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mSort(int[] numbers, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mSort(numbers, beg, mid);
            mSort(numbers, mid + 1, end);
            merge_Sort(numbers, beg, mid, end);
        }
    }
}

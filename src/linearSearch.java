import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public int linear_Search(int[] numbers, int key) {
        int numberSize = numbers.length;
        for (int i = 0; i < numberSize; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

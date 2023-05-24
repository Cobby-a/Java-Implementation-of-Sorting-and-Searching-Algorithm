public class bubbleSort {
    public void bubble_sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int tp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tp;
                }
            }
        }
    }
}

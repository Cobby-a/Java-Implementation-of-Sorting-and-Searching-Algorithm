public class selectionSort {
    public void selection_Sort(int[] numbers) {
        for (int i = 0; i < (numbers.length - 1); i++) {
            int indexSmall = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexSmall]) {
                    indexSmall = j;
                }
            }
            int tp = numbers[indexSmall];
            numbers[indexSmall] = numbers[i];
            numbers[i] = tp;
        }
    }
}

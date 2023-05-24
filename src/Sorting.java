import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    private selectionSort selectSort;
    private bubbleSort bubSort;
    private insertionSort insertSort;

    public Sorting(){
        selectSort = new selectionSort();
        new mergeSort();
        new quickSort();
        bubSort = new bubbleSort();
        insertSort = new insertionSort();
    }
    public void Sort (String check) {
        selectSort = new selectionSort();
        new mergeSort();
        new quickSort();
        bubSort = new bubbleSort();
        insertSort = new insertionSort();
        switch (check) {
            case "1" -> {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the size of your list or array to be sorted: ");
                int size = input.nextInt();
                int[] numbers = new int[size];
                System.out.println("Enter the numbers to be sorted: ");
                for (int i = 0; i < size; i++) {
                    numbers[i] = input.nextInt();
                }
                System.out.println("Your unsorted numbers are: " + Arrays.toString(numbers));
                selectSort.selection_Sort(numbers);
                System.out.println("Your sorted numbers using selection sort are: " + Arrays.toString(numbers));
            }
            case "2" -> {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the size of your list or array to be sorted: ");
                int size = input.nextInt();
                int[] numbers = new int[size];
                System.out.println("Enter the numbers to be sorted: ");
                for (int i = 0; i < size; i++) {
                    numbers[i] = input.nextInt();
                }
                mergeSort m1 = new mergeSort();
                System.out.println("Your unsorted numbers are: " + Arrays.toString(numbers));
                m1.mSort(numbers, 0, numbers.length - 1);
                System.out.println("Your sorted numbers using merge sort are: " + Arrays.toString(numbers));
            }
            case "3" -> {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the size of your list or array to be sorted: ");
                int size = input.nextInt();
                int[] numbers = new int[size];
                System.out.println("Enter the numbers to be sorted: ");
                for (int i = 0; i < size; i++) {
                    numbers[i] = input.nextInt();
                }
                System.out.println("Your unsorted numbers are: " + Arrays.toString(numbers));
                int start = 0;
                int end = numbers.length - 1;
                quickSort quick = new quickSort();
                quick.quick_Sort(numbers, start, end);
                System.out.println("Your sorted numbers using quick sort are: " + Arrays.toString(numbers));
            }
            case "4" -> {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the size of your list or array to be sorted: ");
                int size = input.nextInt();
                int[] numbers = new int[size];
                System.out.println("Enter the numbers to be sorted: ");
                for (int i = 0; i < size; i++) {
                    numbers[i] = input.nextInt();
                }
                System.out.println("Your unsorted numbers are: " + Arrays.toString(numbers));
                bubSort.bubble_sort(numbers);
                System.out.println("Your sorted numbers using bubble sort are: " + Arrays.toString(numbers));
            }
            case "5" -> {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the size of your list or array to be sorted: ");
                int size = input.nextInt();
                int[] numbers = new int[size];
                System.out.println("Enter the numbers to be sorted: ");
                for (int i = 0; i < size; i++) {
                    numbers[i] = input.nextInt();
                }
                System.out.println("Your unsorted numbers are: " + Arrays.toString(numbers));
                insertSort.insertion_Sort(numbers);
                System.out.println("Your sorted numbers using insert sort are: " + Arrays.toString(numbers));
            }
            default -> System.out.println("Type either 1, 2, 3, 4 or 5 to choose your type of algorithm");
        }
    }
}

class mainSort{
    public static void main(String[] args) {
        String again;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                    Enter the type of sorting algorithm to use.
                    1. Selection Sort
                    2. Merge Sort
                    3. Quick Sort
                    4. Bubble Sort
                    5. Insertion Sort
                    If Selection: type 1, if Merge: type 2, type 3: if Quick, type 4: if Bubble, type 5: if Insertion""");
            String k = input.next();
            Sorting d = new Sorting();
            d.Sort(k);
            System.out.println();
            System.out.println("Do you want to sort another set of numbers (Y/N)? \n y or Y for yes and n or N for no");
            again = input.next();
        }while (again.equalsIgnoreCase("y"));
        System.out.println("Sort Over!");
    }
}

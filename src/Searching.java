import java.util.Scanner;

public class Searching {
    private binarySearch binSearch;
    private linearSearch linSearch;
    public Searching (){
        binSearch = new binarySearch();
        linSearch = new linearSearch();
    }
    public void Search (String check){
        binSearch = new binarySearch();
        linSearch = new linearSearch();
        if (check.equals("1")){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of list or arrays to be searched");
            int size = input.nextInt();
            int [] numbers = new int[size];
            System.out.println("Enter the numbers to be searched: ");
            for (int i = 0; i < size; i ++){
                numbers[i] = input.nextInt();
            }
            System.out.println("Enter your number to be searched: ");
            int key = input.nextInt();
            int result = linSearch.linear_Search(numbers, key);
            if (result != -1) {
                System.out.println("Using Linear Searching, Your number " + key + " can be found at index " + result);
            } else {
                System.out.println("Your number " + key + " cannot be found");
            }
        }
        else if (check.equals("2")){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of list or arrays to be searched");
            int size = input.nextInt();
            int [] numbers = new int[size];
            System.out.println("Enter the numbers: ");
            for (int i = 0; i < size; i ++){
                numbers[i] = input.nextInt();
            }
            System.out.println("Enter your number to be searched: ");
            int key = input.nextInt();
            int result = binSearch.binary_Search(numbers, key);
            if (result != -1) {
                System.out.println("Using Binary Searching, Your number " + key + " can be found at index " + result);
            } else {
                System.out.println("Your number " + key + " cannot be found");
            }
        }
        else{
            System.out.println("Type either 1 or 2 to choose your type of algorithm");
        }
    }
}

class mainSearch {
    public static void main(String[] args) {
        String again;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                    Enter the type of searching algorithm to use.
                    1. Linear Searching
                    2. Binary Searching
                    If Linear, type 1, if binary type 2""");
            String k = input.next();
            Searching d = new Searching();
            d.Search(k);
            System.out.println();
            System.out.println("Do you want to search for another number (Y/N)? \n y or Y for yes and n or N for no");
            again = input.next();
        }while (again.equalsIgnoreCase("y"));
        System.out.println("Search Over!");
    }
}
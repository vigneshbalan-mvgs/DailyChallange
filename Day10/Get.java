import java.util.Scanner;

public class Get {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int mix[] = { 12, 2, 1, 8, 123, 90, 4, 23, 8, 4 };

    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Enter an index to retrieve from the array: ");
    int num = scanner.nextInt(); // Read input from the user

    // Retrieve the element at the given index
    get(mix, num);
    get(arr, num);

  }

  public static void get(int arr[], int x) {
    if (x < 0 || x >= arr.length) {
      System.out.println("Invalid index: " + x);
      return; // Exit the method if the index is invalid
    }
    int k = arr[x];
    System.out.println("Element at index " + x + " is " + k);
  }
}

import java.util.Scanner;

public class ArrLinear {
  public static void main(String[] args) {
    // Create a scanner object to get input from the user
    Scanner scanner = new Scanner(System.in);

    // Ask the user for the size of the array
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    // Declare and initialize the array
    int[] arr = new int[size];

    // Ask the user to enter the elements of the array
    for (int i = 0; i < size; i++) {
      arr[i] = i + 1;
    }

    // Ask the user for the element to search
    System.out.print("Enter the element to search: ");
    int target = scanner.nextInt();

    // Perform the linear search
    int result = linearSearch(arr, target);

    // Output the result of the search
    if (result == -1) {
      System.out.println("Element not found in the array.");
    } else {
      System.out.println("Element found at index: " + result);
    }

    // Close the scanner
    scanner.close();
  }

  // Linear search function
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i; // Return the index where the element is found
      }
    }
    return -1; // Return -1 if the element is not found
  }
}

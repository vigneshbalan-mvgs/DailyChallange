public class Reverse {
  public static void main(String[] args) {
    // Initial array to demonstrate reversing
    int[] a = { 1, 2, 3, 4, 5 };

    // Printing the original array
    System.out.println("Original Array:");
    printArray(a);

    // Reversing the array using iteration and printing the result
    System.out.println("\nReversed using Iteration:");
    reverseUsingIteration(a.clone()); // .clone() is used to avoid modifying the original array

    // Reversing the array using recursion and printing the result
    System.out.println("\nReversed using Recursion:");
    reverseUsingRecursion(a.clone());

    // Reversing the array using a new array and printing the result
    System.out.println("\nReversed using New Array:");
    reverseUsingNewArray(a.clone());
  }

  // Method to reverse the array using iteration
  public static void reverseUsingIteration(int[] arr) {
    int start = 0, end = arr.length - 1; // 'start' points to the first element, 'end' points to the last element

    // Iterating until the 'start' pointer is less than 'end' pointer
    while (start < end) {
      // Swapping the elements at 'start' and 'end' positions
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      // Moving the pointers inward (next elements to swap)
      start++;
      end--;
    }

    // Printing the reversed array
    printArray(arr);
  }

  // Method to reverse the array using recursion
  public static void reverseUsingRecursion(int[] arr) {
    // Calling the helper method to recursively reverse the array
    reverseRecursive(arr, 0, arr.length - 1);

    // Printing the reversed array
    printArray(arr);
  }

  // Recursive helper method to reverse the array
  private static void reverseRecursive(int[] arr, int start, int end) {
    // Base case: if 'start' is greater than or equal to 'end', stop recursion
    if (start >= end)
      return;

    // Swapping elements at 'start' and 'end' positions
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    // Recursive call: move the pointers inward
    reverseRecursive(arr, start + 1, end - 1);
  }

  // Method to reverse the array by creating a new array
  public static void reverseUsingNewArray(int[] arr) {
    // Creating a new array with the same length as the original array
    int[] newArr = new int[arr.length];

    // Filling the new array with elements from the original array in reverse order
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[arr.length - 1 - i];
    }

    // Printing the new array (which is the reversed version of the original array)
    printArray(newArr);
  }

  // Utility method to print the array
  public static void printArray(int[] arr) {
    // Looping through each element of the array and printing it
    for (int num : arr) {
      System.out.print(num + " ");
    }
    // Printing a new line after the array to separate outputs
    System.out.println();
  }
}

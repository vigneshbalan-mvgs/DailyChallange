import java.util.Scanner;

public class AllArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Get array size from user
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    // Initialize the array
    int[] arr = new int[size];

    // Fill the array with user input
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      System.out.print("Element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("1. Display Array");
      System.out.println("2. Inverse Array");
      System.out.println("3. Reverse Array");
      System.out.println("4. Linear Search");
      System.out.println("5. Bubble Sort");
      System.out.println("6. Insertion Sort");
      System.out.println("7. Selection Sort");
      System.out.println("8. Delete Element");
      System.out.println("9. Sum of Array");
      System.out.println("10. Exit");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          display(arr);
          break;
        case 2:
          Inverse(arr);
          break;
        case 3:
          Reverse(arr);
          break;
        case 4:
          System.out.print("Enter element to search: ");
          int target = sc.nextInt();
          LinearSearch(arr, target);
          break;
        case 5:
          BubbleSort(arr);
          System.out.println("Array after Bubble Sort:");
          display(arr);
          break;
        case 6:
          InsertionSort(arr);
          System.out.println("Array after Insertion Sort:");
          display(arr);
          break;
        case 7:
          SelectionSort(arr);
          System.out.println("Array after Selection Sort:");
          display(arr);
          break;
        case 8:
          System.out.print("Enter element to delete: ");
          int del = sc.nextInt();
          Delete(arr, del);
          System.out.println("Array after deletion:");
          display(arr);
          break;
        case 9:
          Sum(arr);
          break;
        case 10:
          System.out.println("Exiting...");
          sc.close();
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  public static void display(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void Inverse(int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void Reverse(int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void LinearSearch(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("Element found at index " + i);
        return;
      }
    }
    System.out.println("Element not found in the array");
  }

  public static void BubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void InsertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void SelectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

  public static void Delete(int arr[], int target) {
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        for (int j = i; j < arr.length - 1; j++) {
          arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = 0; // Replace the last element with 0
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Element not found for deletion");
    }
  }

  public static void Sum(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("The sum is " + sum);
  }
}

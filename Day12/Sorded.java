import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        // Initialize the array
        int[] a = {1, 2, 3, 4, 6};

        // Insert 5 into the sorted array
        a = InsertInSort(a, 5);

        // Display the array
        Display(a);
    }

    public static int[] InsertInSort(int[] a, int x) {
        // Create a new array of size one more than the original array
        int[] newArray = new int[a.length + 1];
        int i = a.length - 1;

        // Copy the elements from the original array to the new array
        while (i >= 0 && a[i] > x) {
            newArray[i + 1] = a[i];
            i--;
        }

        // Insert the new element
        newArray[i + 1] = x;

        // Copy the remaining elements
        for (int j = 0; j <= i; j++) {
            newArray[j] = a[j];
        }

        return newArray;
    }

    public static void Display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


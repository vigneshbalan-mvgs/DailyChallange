public class MergeArray {
  public static void main(String[] args) {
    // Define two sorted arrays to be merged
    int[] a = { 1, 2, 3 };
    int[] b = { 4, 5, 6 };

    // Call the append method to merge arrays 'a' and 'b'
    int[] c = append(a, b);

    // Print the merged array
    for (int i : c) {
      System.out.print(i + " "); // Print each element in the merged array
    }
  }

  /**
   * Merges two sorted arrays into a single sorted array.
   * 
   * @param a First sorted array.
   * @param b Second sorted array.
   * @return A merged sorted array containing elements of both input arrays.
   */
  public static int[] append(int[] a, int[] b) {
    // Create a new array to hold the merged elements
    int[] c = new int[a.length + b.length];

    // Get the lengths of both input arrays
    int m = a.length;
    int n = b.length;

    // Initialize pointers for arrays 'a', 'b', and the merged array 'c'
    int i = 0, j = 0, k = 0;

    // Merge elements from both arrays in sorted order
    while (i < m && j < n) {
      if (a[i] < b[j]) {
        // Add the smaller element from array 'a' to 'c'
        c[k++] = a[i++];
      } else {
        // Add the smaller element from array 'b' to 'c'
        c[k++] = b[j++];
      }
    }

    // Add remaining elements from array 'a' (if any)
    for (; i < m; i++) {
      c[k++] = a[i];
    }

    // Add remaining elements from array 'b' (if any)
    for (; j < n; j++) {
      c[k++] = b[j];
    }

    // Return the merged array
    return c;
  }
}

public class FindInArrMul {
  public static void main(String[] args) {
    int a[] = {  6, 7, 8, 9, 10, 12,  15, 16, 17, 18, 19, 20 };
    findMissing(a);
  }
  // find a multiple missing element currently finding only
  // sorted array
  public static void findMissing(int[] a) {
    int first = a[0];  // First element of the array
    int last = a[a.length - 1];  // Last element of the array

    System.out.println("First element is " + first);
    System.out.println("Last element is " + last);

    // Iterate over the expected range and find missing elements
    int expected = first;
    for (int actual : a) {
      while (actual > expected) { // Check for gaps
        System.out.println("Missing element: " + expected);
        expected++;
      }
      expected++;
    }

  }
}

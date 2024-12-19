public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int target = 3;
    int result = binarySearch(arr, target);
    System.out.println("Index of " + target + " is: " + result);
  }

  public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    return binarySearch(arr, left, right, target);
  }
}

public class FindInArr {
  public static void main(String[] args) {
    int a[] = { 3, 5, 6, 7 };
    int b[] = { 1, 2, 3, 5, 6, 7 };
    find(a);
    find1(b);
    find1(a);
    find(b);
  }

  public static void find1(int a[]) {
    int sum = 0;
    int max = 0; // Variable to find the largest number in the array

    for (int i : a) {
      sum += i; // Add the current element to the sum
      if (i > max) {
        max = i; // Update max if the current element is greater
      }
    }

    // Calculate the expected sum of numbers from 1 to max
    int expectedSum = max * (max + 1) / 2;

    // Find the missing number
    int result = expectedSum - sum;

    System.out.println("Missing number is " + result);
  }

  public static void find(int a[]) {
    int start = a[0]; // The first element of the array

    for (int index = 0; index < a.length; index++) {
      if (a[index] - index != start) {
        System.out.println("Missing number is " + (index + start));
        break;
      }
    }
  }
}

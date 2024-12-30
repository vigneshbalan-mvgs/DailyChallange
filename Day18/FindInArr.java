public class FindInArr {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7 };
    // find(a);
    find1(a);
  }

  public static void find(int a[]) {
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

  public static void find1(int a[]) {
    // its a different like starting element minus 0;
    int start = a[0];
    int end = a[a.length - 1];
    System.out.println(start);
    System.out.println(end);
  }

}

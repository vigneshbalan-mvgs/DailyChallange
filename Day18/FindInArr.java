public class FindInArr {
  public static void main(String[] args) {
    int a[] = { 3, 5, 6, 7 };
    int b[] = { 1, 2, 3, 5, 6, 7 };
    int c[] = { 1, 2,4, 5, 6, 7 };
    int d[] = { 2, 3,4, 5, 6, 7 };
    int e[] = { 1, 2, 3,4, 5, 6, 7 };

    findMissing(a);
    findMissing(b);
    findMissing(c);
    findMissing(d);
    findMissing(e);
  }

  public static void findMissing(int a[]) {
    int start = a[0]; // First element in the array
    int end = a[a.length - 1]; // Last element in the array

    // Check for missing numbers before the first element
    if (start > 1) {
        System.out.println("Missing number is 1");
        return;
    }

    // Check if the array starts from 1
    if (start == 1) {
        // Use sum-based method
        int sum = 0;
        int max = 0;

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

        if (result != 0) {
            System.out.println("Missing number is " + result);
        } else {
            System.out.println("No missing number.");
        }
    } else {
        // Use difference-based method for arrays not starting from 1
        for (int index = 0; index < a.length; index++) {
            if (a[index] - index != start) {
                System.out.println("Missing number is " + (index + start));
                return;
            }
        }
        System.out.println("No missing number.");
    }

  }
}


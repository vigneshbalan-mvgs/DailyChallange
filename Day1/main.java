public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    int[] A = { 1, 2, 3, 4, 5 }; // Example array
    Solution solution = new Solution();
    int sum = solution.solution(A);
    System.out.println("Sum of array: " + sum);
  }
}

final class Solution {
  public int solution(int[] A) {
    return recursiveSum(A, A.length - 1);
  }

  private int recursiveSum(int[] A, int index) {
    if (index < 0) {
      return 0; // Base case: when the array is fully traversed
    }
    return A[index] + recursiveSum(A, index - 1); // Recursive case
  }
}

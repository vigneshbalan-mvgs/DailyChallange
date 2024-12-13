public class Fib {
  public static void main(String[] args) {
    int n = 12;
    int a[] = new int[n + 1]; // Initialize the memo array with a length of 13 (to store results for 0 to 12)

    // Print the result of each Fibonacci function
    System.out.println(fib(n)); // Output using normal recursion
    System.out.println(fib2(n)); // Output using loop (iterative approach)
    System.out.println(fib3(n, a)); // Output using memoization
  }

  // fib using normal recursion
  // Time Complexity: O(2^n) due to the repetitive recalculations
  // Space Complexity: O(n) for the recursion call stack
  public static int fib(int n) {
    if (n <= 1) {
      return n; // Base case: return n if n is 0 or 1
    }
    return fib(n - 1) + fib(n - 2); // Recursive call for the previous two Fibonacci numbers
  }

  // fib using loop (iterative approach)
  // Time Complexity: O(n) since the loop runs n times
  // Space Complexity: O(1) because we only use a fixed amount of extra space for
  // a, b, and c
  public static int fib2(int n) {
    if (n <= 1) {
      return n; // Base case: return n if n is 0 or 1
    }
    int a = 0; // Initialize the first Fibonacci number
    int b = 1; // Initialize the second Fibonacci number
    int c = 0; // Variable to store the next Fibonacci number
    for (int i = 2; i <= n; i++) { // Loop to calculate Fibonacci numbers from 2 to n
      c = a + b; // Calculate the next Fibonacci number
      a = b; // Update a to the previous Fibonacci number
      b = c; // Update b to the current Fibonacci number
    }
    return c; // Return the nth Fibonacci number
  }

  // fib using memoization (top-down dynamic programming)
  // Time Complexity: O(n) since each Fibonacci number is calculated only once
  // Space Complexity: O(n) for the memo array used to store the intermediate
  // results
  public static int fib3(int n, int[] memo) {
    if (n <= 1) {
      return n; // Base case: return n if n is 0 or 1
    }
    if (memo[n] != 0) { // Check if the Fibonacci number has already been calculated
      return memo[n]; // Return the cached value if already calculated
    }
    // Recursively calculate the Fibonacci number and store it in the memo array
    memo[n] = fib3(n - 1, memo) + fib3(n - 2, memo);
    return memo[n]; // Return the nth Fibonacci number from memoization
  }
}

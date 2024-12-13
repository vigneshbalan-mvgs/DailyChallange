public class Taylor {
  public static void main(String[] args) {
    int x = 2; // Value of x in e^x
    int n = 10; // Number of terms in the Taylor series

    // Calling different methods to calculate the Taylor series
    System.out.println("Result: " + taylor(x, n)); // Recursive method
    System.out.println("Result using loop: " + taylor2(x, n)); // Iterative method
    System.out.println("Result using half rec: " + taylor3(x, n)); // Optimized recursion method
  }

  /**
   * Recursive method to calculate the Taylor series for e^x.
   * Time Complexity: O(n) due to n recursive calls.
   * Space Complexity: O(n) because of the recursion stack.
   *
   * @param x The value of x in e^x
   * @param n The number of terms to include
   * @return The computed Taylor series sum
   */
  public static double taylor(int x, int n) {
    if (n == 0)
      return 1; // Base case: e^x = 1 when n = 0

    // Recursive call to calculate the Taylor series for (n - 1) terms
    double r = taylor(x, n - 1);

    // Adding the nth term: x^n / n!
    return r + Math.pow(x, n) / factorial(n);
  }

  /**
   * Helper method to calculate factorial of a number.
   *
   * @param n The number to calculate the factorial for
   * @return The factorial of n
   */
  private static double factorial(int n) {
    if (n == 0)
      return 1; // Base case: 0! = 1
    return n * factorial(n - 1); // Recursive definition of factorial
  }

  /**
   * Iterative method to calculate the Taylor series for e^x.
   * Time Complexity: O(n) due to the loop.
   * Space Complexity: O(1) as it uses constant space.
   *
   * @param x The value of x in e^x
   * @param n The number of terms to include
   * @return The computed Taylor series sum
   */
  public static double taylor2(int x, int n) {
    double s = 1; // Start with the first term of the series: 1

    // Iteratively calculate the series terms
    while (n > 0) {
      s = 1 + ((double) x / n) * s; // Update the series sum
      n--; // Decrement the number of terms
    }
    return s; // Return the final computed sum
  }

  /**
   * Optimized recursive method to calculate the Taylor series for e^x.
   * Time Complexity: O(n) due to n recursive calls.
   * Space Complexity: O(n) because of the recursion stack.
   *
   * @param x The value of x in e^x
   * @param n The number of terms to include
   * @return The computed Taylor series sum
   */
  public static double taylor3(int x, int n) {
    return taylor3Helper(x, n, 1); // Start with s = 1
  }

  /**
   * Helper method for the optimized recursive calculation of the Taylor series.
   *
   * @param x The value of x in e^x
   * @param n The current term being calculated
   * @param s The accumulated series sum so far
   * @return The computed Taylor series sum
   */
  private static double taylor3Helper(int x, int n, double s) {
    if (n == 0)
      return s; // Base case: return the accumulated sum

    // Update the series sum for the current term
    s = 1 + (double) x * s / n;

    // Recursive call to calculate the next term
    return taylor3Helper(x, n - 1, s);
  }
}

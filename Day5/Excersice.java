public class Excersice {

  // Function definition
  public static int fun(int n) {
    int x = 1;

    // Base case
    if (n == 1)
      return x;

    // Recursive case
    for (int k = 1; k < n; ++k) {
      x += fun(k) * fun(n - k);
    }

    return x;
  }

  public static void main(String[] args) {
    // Test for fun(5)
    int result = fun(5);
    System.out.println("The result of fun(5) is: " + result);
  }
}

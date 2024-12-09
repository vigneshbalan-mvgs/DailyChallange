public class Main {
  public static void main(String[] args) {
    int x = 5;
    fun1(x);
  }

  public static void fun1(int x) {
    if (x > 0) {
      // Print stars in ascending order
      for (int i = 0; i < x; i++) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line
      fun1(x - 1); // Recursive call with decremented x
    }

    // Print stars in descending order after recursion
    if (x > 0) {
      for (int i = x; i > 0; i--) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line
    }
  }
}

public class Void {
  public static void main(String[] args) {
    int x = 5;
    System.out.println("using recursion");
    fun1(x);
    System.out.println("using For loop");
    fun2(x);
  }

  // using 2 for
  public static void fun2(int x) {
    // Descending loop: Print the inverse pattern of stars
    for (int i = x; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  // using recursion

  public static void fun1(int x) {
    if (x > 0) {
      // Loop for printing stars in ascending order
      for (int i = 0; i < x; i++) {
        System.out.print("*");
      }
      System.out.println();

      // Call the function recursively
      fun1(x - 1);

      // Loop for printing stars in descending order
      for (int i = 0; i < x; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

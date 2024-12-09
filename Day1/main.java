public class Main {
  public static void main(String[] args) {
    int x = 3;
    fun1(x);
  }

  public static void fun1(int x) {
    System.out.println(x); // Print the current value of x
    if (x > 0) { // Base condition to stop recursion
      fun1(x - 1);
    }
    System.out.println(x);
  }

}

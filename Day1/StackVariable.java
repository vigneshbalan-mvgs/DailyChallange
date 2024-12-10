// Static variable is a variable that is associated with a class and not with a specific object of that class
// At help to only use it once not like a everytime a recuression calles itself it will work just once
// Also know as global variable

public class StackVariable {
  static int a = 0; // Static variable to persist value across calls

  public static void main(String[] args) {
    int n = 5;
    int f = fun1(n);
    System.out.println(f);
    int g = fun1(n);
    System.out.println(g);
  }

  public static int fun1(int n) {
    if (n > 0) {
      a++; // Increment the static variable
      System.out.printf(" a is %d\n", a);
      System.out.printf(" n is %d\n", n);
      fun1(n - 1);
      return fun1(n - 1) + a; // Add the current value of a
    }
    return 0; // Base case: return 0
  }
}

public class Head {

  public static void main(String[] args) {
    int n = 5;
    fun2(n);
    fun1(n);
  }

  // header is equal to ascending order
  public static void fun1(int n) {
    if (n > 0) {
      fun1(n - 1);
      System.out.println(n);
    }
  }

  // header is equal to descending order
  public static void fun2(int n) {
    if (n > 0) {
      System.out.println(n);
      fun1(n - 1);
    }
  }

}

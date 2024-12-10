public class Tail {

  public static void main(String[] args) {
    int n = 5;
    fun1(n);
  }

  public static void fun1(int n) {
    if (n > 0) {
      System.out.println(n);
      fun1(n - 1);
    }
  }
}

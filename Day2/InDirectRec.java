// the function1 calling function2 then the function2 calling function1
// is know as indirect recursion

public class InDirectRec {
  public static void main(String[] args) {
    fun1(20);
  }

  public static void fun1(int x) {
    if (x > 0) {
      System.out.println(x);
      fun2(x - 1);
    }
  }

  public static void fun2(int x) {
    if (x > 1) {
      System.out.println(x);
      fun1(x / 2);
    }
  }

}

public class PowerFun {
  public static void main(String[] args) {
    long a = 2;
    long b = 8;
    long r = fun1(a, b);
    System.out.println(r);
    long s = fun2(a, b);
    System.out.println(s);

  }

  public static long fun1(long x, long y) {
    // System.out.println(x + " " + y);
    if (x == 0)
      return 1;
    if (y % 2 == 0) {
      return fun1(x * x, y / 2);
    }
    return x * fun1(x * x, (y - 1) / 2);

  }

  public static long fun2(long x, long y) {
    // System.out.println(x + " " + y);
    if (y == 0) {
      return 1;
    }
    return fun2(x, y - 1) * x;
  }

}

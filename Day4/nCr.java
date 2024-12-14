public class nCr {
  public static void main(String[] args) {
    System.out.println(nCr(5, 4));
  }

  public static int nCr(int n, int r) {
    return fact(n) / (fact(r) * fact(n - r));
  }

  public static int fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fact(n - 1);

  }

}

public class nCr {
  public static void main(String[] args) {
    System.out.println(nCr(4, 2));
    System.out.println(ncr(4, 2));
  }

  public static int ncr(int n, int r) {
    if (n == r || r == 0) {
      return 1;
    } else {
      return ncr(n - 1, r - 1) + ncr(n - 1, r);

    }
  }

  public static int nCr(int n, int r) {
    int num = fact(n);
    int den = fact(r) * fact(n - r);
    return num / den;
  }

  public static int fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fact(n - 1);

  }

}

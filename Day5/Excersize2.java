public class Excersize2 {
  public static void main(String[] args) {

    System.out.println(ex(2));
    System.out.println(ex(12));
  }

  static int d = 1;

  public static int ex(int n) {
    System.out.println("d = " + d);
    if (n > 0) {
      d = d * ex(n - 1);
      System.out.println("d = " + d);
    }

    return n;
  }
}

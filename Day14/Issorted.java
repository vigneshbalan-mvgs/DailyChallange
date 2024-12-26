public class Issorted {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 1, 5 };
    int[] b = { 1, 2, 3, 4, 5 };
    System.out.println(issorted(a));
    System.out.println(issorted(b));
  }

  public static boolean issorted(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        return false;
      }
    }
    return true;
  }
}

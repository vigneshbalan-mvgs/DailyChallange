public class NNaturalNumber {
  public static void main(String[] args) {
    int m = 5;
    System.out.println(sum(m));
  }

  public static int sum(int x) {
    if (x == 0) {
      return 0;
    }
    return sum(x - 1) + x;
  }
}

public class TOH {
  public static void main(String[] args) {
    solve(10, 1, 2, 3);

  }

  public static void solve(int n, int A, int B, int C) {
    if (n > 0) {
      solve(n - 1, A, C, B);
      System.out.println("Move disk " + n + " from " + A + " to " + C);
      solve(n - 1, B, A, C);
    }
  }

}

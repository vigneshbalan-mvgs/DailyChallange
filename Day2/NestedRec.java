public class NestedRec {
  public static void main(String[] args) {
    int x = 4;
    int result = name(x);
    System.out.println("Result: " + result);
  }

  public static int name(int x) {
    if (x > 100) {
      return x - 10;
    } else {
      return name(name(x + 11));
    }
  }
}

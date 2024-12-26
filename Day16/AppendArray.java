public class AppendArray {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    int[] b = { 1, 2, 3, 4, 5 };

    int[] result = append(a, b);

    // Print the result array
    for (int num : result) {
      System.out.print(num + " ");
    }
  }

  public static int[] append(int[] a, int[] b) {
    int[] c = new int[a.length + b.length];

    for (int i = 0; i < a.length; i++) {
      c[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
      c[a.length + i] = b[i];
    }

    return c;
  }
}

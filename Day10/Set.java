public class Set {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    get(a, 0, 12);
    get(a, 1, 20);
    get(a, 2, 120);
    get(a, 3, 12);
    get(a, 4, 12);
    get(a, 5, 12);
    get(a, 6, 12);
    get(a, 7, 12);
    get(a, 8, 12);

  }

  public static void get(int a[], int x, int k) {
    if (x < 0 || x >= a.length) {
      System.out.println("Invalid index: " + x);
      return;
    } else {
      a[x] = k;
      System.out.println("Element at index " + x + " is " + a[x]);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }
    }
  }
}

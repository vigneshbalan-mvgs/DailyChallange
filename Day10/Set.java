public class Set {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    get(a, 0, 12);
    max(a);
    min(a);
    sum(a);
    Avg(a);
  }

  public static void get(int a[], int x, int k) {
    if (x < 0 || x >= a.length) {
      System.out.println("Invalid index: " + x);
      return;
    } else {
      a[x] = k;
      System.out.println("Element at index " + x + " is " + a[x]);
    }
  }

  public static void max(int a[]) {
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("The max is " + max);
  }

  public static void min(int a[]) {
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    System.out.println("The min is " + min);
  }

  public static void sum(int a[]) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    System.out.println("The sum is " + sum);
  }

  public static void Avg(int a[]) {
    int avg = 0;
    for (int i = 0; i < a.length; i++) {
      avg = avg + a[i];
    }
    avg = avg / a.length;
    System.out.println("The avg is " + avg);
  }

}

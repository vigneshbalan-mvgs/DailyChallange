public class Rearrage {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    rearrange(arr);
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void rearrange(int[] arr) {
    int i, j;
    i = 0;
    j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      System.out.println("Swapping " + arr[i] + " " + arr[j]);
      i++;
      j--;
    }
  }
}

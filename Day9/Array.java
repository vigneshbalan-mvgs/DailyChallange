public class Array {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int mix[] = {12, 2, 1, 8, 123, 90, 4, 23, 8, 4};

        // Normal loops
        // display(arr);
        // display(mix);

        // Enhanced for-loop
        // arr1(arr);
        // arr1(mix);

        // Binary search example
        int key = 12;
        int index = arr2(arr, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }

    // Normal for-loop display
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Enhanced for-loop display
    public static void arr1(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // Binary search implementation
    public static int arr2(int arr[], int key) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] == key) {
                return mid; // Key found
            } else if (key < arr[mid]) {
                h = mid - 1; // Search in the left half
            } else {
                l = mid + 1; // Search in the right half
            }
        }
        return -1; // Key not found
    }
}


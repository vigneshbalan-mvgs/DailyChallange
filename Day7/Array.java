public class Array {
  int[] A; // Array to hold integers
  int size; // Size of the array
  int length; // Current length (number of elements)

  // Constructor to initialize the size and array
  public Array(int size) {
    this.size = size;
    this.length = 0; // Initially no elements
    this.A = new int[size]; // Allocate memory for the array
  }

  // Method to add an element to the array
  public void add(int element) {
    if (length < size) { // Check if space is available
      A[length] = element;
      length++;
    } else {
      System.out.println("Array is full. Cannot add " + element);
    }
  }

  // Method to display the array elements
  public void display() {
    System.out.println("Array elements are:");
    for (int i = 0; i < length; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // Create an Array object with size 5
    Array myArray = new Array(5);

    // Add elements to the array
    myArray.add(1);
    myArray.add(2);
    myArray.add(3);
    myArray.add(4);
    myArray.add(5);

    // Try to add another element (should fail)
    myArray.add(6);

    // Display the array elements
    myArray.display();
  }
}

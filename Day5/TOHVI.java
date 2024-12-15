import java.util.ArrayList;
import java.util.List;

public class TOHVI {
  public static void main(String[] args) throws InterruptedException {
    // Number of disks
    int n = 10;

    // Initialize rods
    List<Integer> rodA = new ArrayList<>();
    List<Integer> rodB = new ArrayList<>();
    List<Integer> rodC = new ArrayList<>();

    // Add disks to rod A
    for (int i = n; i >= 1; i--) {
      rodA.add(i);
    }

    // Print initial state
    printRods(n, rodA, rodB, rodC);

    // Solve Tower of Hanoi
    solve(n, rodA, rodB, rodC, "A", "B", "C");
  }

  public static void solve(int n, List<Integer> source, List<Integer> auxiliary, List<Integer> destination,
      String srcName, String auxName, String destName) throws InterruptedException {
    if (n > 0) {
      // Step 1: Move n-1 disks from source to auxiliary
      solve(n - 1, source, destination, auxiliary, srcName, destName, auxName);

      // Step 2: Move the nth disk from source to destination
      destination.add(source.remove(source.size() - 1));
      System.out.println("Move disk " + n + " from " + srcName + " to " + destName);
      printRods(n, source, auxiliary, destination);
      Thread.sleep(2000); // Add 1-second delay for visualization

      // Step 3: Move n-1 disks from auxiliary to destination
      solve(n - 1, auxiliary, source, destination, auxName, srcName, destName);
    }
  }

  public static void printRods(int n, List<Integer> rodA, List<Integer> rodB, List<Integer> rodC) {
    System.out.println("State:");
    System.out.println("1 - " + rodA);
    System.out.println("2 - " + rodB);
    System.out.println("3 - " + rodC);
    System.out.println();
  }
}

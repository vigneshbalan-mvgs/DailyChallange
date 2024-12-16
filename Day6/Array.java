import java.util.ArrayList;

public class Array {
  public static void main(String[] args) {
    ArrayList<Point> points = new ArrayList<>();

    points.add(new Point(1, 2));
    points.add(new Point(3, 4));
    points.add(new Point(5, 6));
    points.add(new Point(7, 8));
    points.add(new Point(9, 10));

    System.out.println("Points in the dynamic array:");
    for (Point point : points) {
      System.out.println(point);
    }

    points.remove(1);
    System.out.println("\nAfter removing the point at index 1:");
    for (Point point : points) {
      System.out.println(point);
    }

    points.add(new Point(7, 8));
    System.out.println("\nAfter adding a new point:");
    for (Point point : points) {
      System.out.println(point);
    }

    Point specificPoint = points.get(1);
    System.out.println("\nAccessed Point at index 1: " + specificPoint);

    System.out.println("\nTotal number of points: " + points.size());
  }
}

class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}

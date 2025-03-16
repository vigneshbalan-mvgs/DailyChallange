#include <cmath>    // For mathematical functions and constants (like M_PI)
#include <iostream> // For input/output stream
#include <vector>   // For using the vector container

// Base abstract class 'Shape'
class Shape {
public:
  // Pure virtual function for calculating the area of a shape.
  // Being pure virtual makes 'Shape' an abstract class.
  virtual double area() const = 0;

  // Pure virtual function for calculating the perimeter of a shape.
  virtual double perimeter() const = 0;

  // Virtual destructor to ensure that derived class destructors are called
  // properly.
  virtual ~Shape() {}
};

// Derived class 'Rectangle' that inherits from 'Shape'
class Rectangle : public Shape {
private:
  double length; // Length of the rectangle (encapsulated)
  double width;  // Width of the rectangle (encapsulated)

public:
  // Constructor that initializes the rectangle with a given length and width.
  Rectangle(double l, double w) : length(l), width(w) {}

  // Override the area() method to return the area of the rectangle.
  virtual double area() const override { return length * width; }

  // Override the perimeter() method to return the perimeter of the rectangle.
  virtual double perimeter() const override { return 2 * (length + width); }

  // Additional function to display the dimensions of the rectangle.
  void displayDimensions() const {
    std::cout << "Rectangle Dimensions: length = " << length
              << ", width = " << width << std::endl;
  }
};

// Derived class 'Circle' that inherits from 'Shape'
class Circle : public Shape {
private:
  double radius; // Radius of the circle (encapsulated)

public:
  // Constructor that initializes the circle with a given radius.
  Circle(double r) : radius(r) {}

  // Override the area() method to return the area of the circle.
  virtual double area() const override { return M_PI * radius * radius; }

  // Override the perimeter() method to return the circumference of the circle.
  virtual double perimeter() const override { return 2 * M_PI * radius; }

  // Additional function to display the dimension of the circle.
  void displayDimensions() const {
    std::cout << "Circle Dimension: radius = " << radius << std::endl;
  }
};

// The main function demonstrating the use of OOP features.
int main() {
  // Create a vector to store pointers to 'Shape' objects.
  // This vector can hold objects of any class derived from 'Shape'.
  std::vector<Shape *> shapes;

  // Dynamically allocate a Rectangle and a Circle, and add them to the vector.
  shapes.push_back(
      new Rectangle(5.0, 3.0));      // Rectangle with length 5.0 and width 3.0
  shapes.push_back(new Circle(4.0)); // Circle with radius 4.0

  // Iterate over each shape in the vector.
  for (size_t i = 0; i < shapes.size(); ++i) {
    std::cout << "Shape " << i + 1 << ":" << std::endl;
    // Call virtual functions for area and perimeter.
    // The correct function (Rectangle's or Circle's) is called at runtime.
    std::cout << "Area: " << shapes[i]->area() << std::endl;
    std::cout << "Perimeter: " << shapes[i]->perimeter() << std::endl;

    // Use dynamic_cast to determine the actual type of the shape.
    // This allows us to call type-specific functions.
    if (Rectangle *rect = dynamic_cast<Rectangle *>(shapes[i])) {
      rect->displayDimensions();
    } else if (Circle *circ = dynamic_cast<Circle *>(shapes[i])) {
      circ->displayDimensions();
    }
    std::cout << "------------------------" << std::endl;
  }

  // Clean up: delete each dynamically allocated shape to prevent memory leaks.
  for (Shape *shape : shapes) {
    delete shape;
  }
  // Optionally clear the vector (not strictly necessary as the program is
  // ending).
  shapes.clear();

  return 0;
}


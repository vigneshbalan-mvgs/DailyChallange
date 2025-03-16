# Java Refresher Guide

## 🔹 1. Java Basics

### 1.1 Syntax & Data Types

Java is **statically typed**, meaning every variable has a fixed type.

```java
public class Basics {
    public static void main(String[] args) {
        int num = 10;         // Integer
        double price = 99.99; // Decimal
        char letter = 'A';    // Single character
        boolean isJavaFun = true; // Boolean
        String text = "Hello, Java!"; // String

        System.out.println(text);
    }
}
```

### 1.2 Operators

- **Arithmetic**: `+`, `-`, `*`, `/`, `%`
- **Comparison**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical**: `&&`, `||`, `!`
- **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`

---

## 🔹 2. Control Statements

### 2.1 If-Else

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are a minor.");
}
```

### 2.2 Loops

#### For Loop

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

#### While Loop

```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```

#### Do-While Loop

```java
int i = 1;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i <= 5);
```

---

## 🔹 3. OOP Concepts in Java

### 3.1 Classes & Objects

```java
class Car {
    String brand;
    int speed;

    void showDetails() {
        System.out.println(brand + " is moving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.speed = 120;
        myCar.showDetails();
    }
}
```

### 3.2 Inheritance

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // From Animal class
        myDog.bark(); // From Dog class
    }
}
```

### 3.3 Polymorphism (Method Overriding)

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat(); // Polymorphism
        myAnimal.makeSound();
    }
}
```

---

## 🔹 4. Core Java Concepts

### 4.1 Exception Handling

```java
try {
    int result = 10 / 0; // Will cause an error
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero!");
} finally {
    System.out.println("Execution completed.");
}
```

### 4.2 Collections Framework

```java
import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

### 4.3 Multithreading

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

### 4.4 File Handling

```java
import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello, Java File Handling!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
```

### 4.5 Java Streams (Functional Programming)

```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
```

### 4.6 Lambda Expressions

```java
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operation(10, 5));
    }
}
```

---

## ✅ Summary

This guide covered:

- **Java basics**: Syntax, data types, control structures
- **OOP principles**: Classes, inheritance, polymorphism
- **Core Java**: Exception handling, collections, multithreading, file handling, functional programming

**Next Steps:**

1. Practice with small coding problems.
2. Work on a **mini project** (Calculator, Task Manager, etc.).
3. Revise **DSA concepts** in Java.

Would you like some Java **coding exercises** for practice? 🚀

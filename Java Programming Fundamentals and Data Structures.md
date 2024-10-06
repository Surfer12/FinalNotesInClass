# Java Programming Fundamentals and Data Structures

## Table of Contents

- [1. Introduction to Java](#1-introduction-to-java)
  - [1.1 Basic Syntax](#11-basic-syntax)
  - [1.2 Variables and Data Types](#12-variables-and-data-types)
  - [1.3 Operators](#13-operators)
  - [1.4 Control Flow Statements](#14-control-flow-statements)
- [2. Object-Oriented Programming in Java](#2-object-oriented-programming-in-java)
  - [2.1 Classes and Objects](#21-classes-and-objects)
  - [2.2 Encapsulation](#22-encapsulation)
  - [2.3 Inheritance](#23-inheritance)
  - [2.4 Polymorphism](#24-polymorphism)
  - [2.5 Abstraction](#25-abstraction)
  - [2.6 Interfaces](#26-interfaces)
- [3. Java Collections Framework](#3-java-collections-framework)
  - [3.1 Arrays](#31-arrays)
  - [3.2 Linked Lists](#32-linked-lists)
  - [3.3 Stacks](#33-stacks)
  - [3.4 Queues](#34-queues)
  - [3.5 HashMaps and HashSets](#35-hashmaps-and-hashsets)
  - [3.6 Trees](#36-trees)
- [4. Algorithm Design and Analysis](#4-algorithm-design-and-analysis)
  - [4.1 Introduction to Algorithms](#41-introduction-to-algorithms)
  - [4.2 Sorting Algorithms](#42-sorting-algorithms)
  - [4.3 Searching Algorithms](#43-searching-algorithms)
  - [4.4 Recursion](#44-recursion)
  - [4.5 Big O Notation and Efficiency](#45-big-o-notation-and-efficiency)
- [5. Exception Handling and File I/O](#5-exception-handling-and-file-io)
  - [5.1 Exception Handling](#51-exception-handling)
  - [5.2 File Input/Output Operations](#52-file-inputoutput-operations)
- [6. Best Practices and Professional Development](#6-best-practices-and-professional-development)
  - [6.1 Code Organization](#61-code-organization)
  - [6.2 Debugging Techniques](#62-debugging-techniques)
  - [6.3 Testing in Java](#63-testing-in-java)

## 1. Introduction to Java

### 1.1 Basic Syntax

Java programs are composed of classes and methods. Here's a basic structure:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 1.2 Variables and Data Types

Java is a strongly-typed language. Common data types include:

- Primitive types: int, double, boolean, char
- Reference types: String, arrays, custom objects

Example:
```java
int age = 25;
double salary = 50000.50;
boolean isStudent = true;
String name = "John Doe";
```

### 1.3 Operators

Java supports various operators:

- Arithmetic: +, -, *, /, %
- Comparison: ==, !=, >, <, >=, <=
- Logical: &&, ||, !

### 1.4 Control Flow Statements

Control flow is managed using:

- if-else statements
- switch statements
- for loops
- while loops
- do-while loops

Example:
```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

## 2. Object-Oriented Programming in Java

### 2.1 Classes and Objects

Classes are blueprints for objects. Objects are instances of classes.

```java
public class Car {
    String model;
    int year;

    public void start() {
        System.out.println("The car is starting");
    }
}

Car myCar = new Car();
myCar.model = "Toyota";
myCar.start();
```

### 2.2 Encapsulation

Encapsulation is about hiding internal details and providing a public interface.

```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

### 2.3 Inheritance

Inheritance allows a class to inherit properties and methods from another class.

```java
public class Vehicle {
    protected String brand;

    public void honk() {
        System.out.println("Beep!");
    }
}

public class Car extends Vehicle {
    public void drive() {
        System.out.println("The " + brand + " is driving");
    }
}
```

### 2.4 Polymorphism

Polymorphism allows objects of different types to be treated as objects of a common base type.

```java
public abstract class Shape {
    public abstract double getArea();
}

public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }
}

Shape circle = new Circle();
Shape rectangle = new Rectangle();
```

### 2.5 Abstraction

Abstraction focuses on essential qualities rather than specific characteristics.

```java
public abstract class Animal {
    public abstract makeSound();
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

### 2.6 Interfaces

Interfaces define a contract of methods that implementing classes must fulfill.

```java
public interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

## 3. Java Collections Framework

### 3.1 Arrays

Arrays are fixed-size, contiguous blocks of memory for storing elements of the same type.

```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;

String[] fruits = {"apple", "banana", "orange"};
```

### 3.2 Linked Lists

LinkedList is a doubly-linked list implementation of the List and Deque interfaces.

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("First");
linkedList.add("Second");
linkedList.addFirst("New First");
```

### 3.3 Stacks

Stack is a last-in-first-out (LIFO) data structure.

```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
int top = stack.pop(); // Returns 2
```

### 3.4 Queues

Queue is a first-in-first-out (FIFO) data structure.

```java
Queue<String> queue = new LinkedList<>();
queue.offer("First");
queue.offer("Second");
String first = queue.poll(); // Returns "First"
```

### 3.5 HashMaps and HashSets

HashMap stores key-value pairs, while HashSet stores unique elements.

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
int value = map.get("One"); // Returns 1

HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
boolean contains = set.contains("Apple"); // Returns true
```

### 3.6 Trees

Trees are hierarchical data structures. Here's a simple binary tree implementation:

```java
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}

public class BinaryTree {
    TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);

        return root;
    }
}
```

## 4. Algorithm Design and Analysis

### 4.1 Introduction to Algorithms

Algorithms are step-by-step procedures for solving problems. Key aspects include:
- Correctness
- Efficiency
- Clarity
- Finiteness

### 4.2 Sorting Algorithms

#### Bubble Sort
```java
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if (arr[j] > arr[j+1]) {
                // swap arr[j+1] and arr[j]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
}
```

#### Merge Sort
```java
public static void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}

private static void merge(int[] arr, int l, int m, int r) {
    // Implementation of merge function
    // ...
}
```

### 4.3 Searching Algorithms

#### Binary Search
```java
public static int binarySearch(int[] arr, int x) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
        int m = l + (r - l) / 2;
        if (arr[m] == x)
            return m;
        if (arr[m] < x)
            l = m + 1;
        else
            r = m - 1;
    }
    return -1;
}
```

### 4.4 Recursion

Recursion is a method where the solution to a problem depends on solutions to smaller instances of the same problem.

```java
public static int factorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}
```

### 4.5 Big O Notation and Efficiency

Big O notation describes the upper bound of the growth rate of an algorithm's time complexity.

Common complexities:
- O(1): Constant time
- O(log n): Logarithmic time
- O(n): Linear time
- O(n log n): Log-linear time
- O(n^2): Quadratic time
- O(2^n): Exponential time

## 5. Exception Handling and File I/O

### 5.1 Exception Handling

Java uses try-catch blocks for exception handling.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("This always executes");
}
```

### 5.2 File Input/Output Operations

Java provides classes for file I/O operations.

```java
try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
     BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        writer.write(line);
        writer.newLine();
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

## 6. Best Practices and Professional Development

### 6.1 Code Organization

- Use meaningful names for variables, methods, and classes
- Follow Java naming conventions
- Keep methods short and focused on a single task
- Organize related classes into packages

### 6.2 Debugging Techniques

- Use IDE debugging tools
- Add logging statements
- Understand and interpret stack traces
- Use assertions for invariant checking

### 6.3 Testing in Java

- Write unit tests using JUnit
- Practice Test-Driven Development (TDD)
- Use mocking frameworks for isolating components in tests

Example JUnit test:
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }
}
```

This comprehensive guide covers the fundamental concepts of Java programming, data structures, and algorithms. It provides a solid foundation for learners to build upon, with practical examples and explanations of key concepts. Remember to practice regularly and work on projects to reinforce your understanding of these topics.
````

This Markdown document now includes a clickable table of contents that links to each section and subsection for easy navigation.
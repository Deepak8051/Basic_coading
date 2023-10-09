package com;

//Abstract class
abstract class Shape {
 // Abstract method (no implementation)
 public abstract double area();
 
 // Concrete method
 public void displayArea() {
     System.out.println("Area: " + area());
 } 
}

//Concrete subclass 1
class Circle extends Shape {
 private double radius;
 
 public Circle(double radius) {
     this.radius = radius;
 }
 
 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Concrete subclass 2
class Rectangle extends Shape {
 private double length;
 private double width;
 
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 @Override
 public double area() {
     return length * width;
 }
}

public class Abstraction  {
 public static void main(String[] args) {
     // You cannot create an instance of an abstract class
     // Shape shape = new Shape(); // This will result in an error
     
     // Create instances of concrete subclasses
    /* Circle circle = new Circle(5.0);
     Rectangle rectangle = new Rectangle(4.0, 6.0);
     
     // Use the abstract class reference to access the objects
     Shape shape1 = circle;
     Shape shape2 = rectangle;
     
     // Call the abstract method and display the area
     shape1.displayArea(); // Output: Area: 78.53981633974483
     shape2.displayArea(); // Output: Area: 24.0*/
	 //Rectangle r = new Rectangle();
	 
 }
}


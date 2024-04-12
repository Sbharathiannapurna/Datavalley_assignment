/*Abstraction in Java is a fundamental principle of object-oriented programming where the essential details of a class are emphasized while hiding the unnecessary implementation details from the user. It allows programmers to focus on what an object does rather than how it does it.

There are two primary ways to implement abstraction in Java:

    Abstract Classes
    Interfaces*/
package Assignment3;

abstract class Shape {
 abstract double area();
}

class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}



public class Abstraction {
	
	 public static void main(String[] args) {
	     // Creating a Circle object
	     Circle circle = new Circle(5);
	     System.out.println("Area of circle: " + circle.area());
	 }
	}


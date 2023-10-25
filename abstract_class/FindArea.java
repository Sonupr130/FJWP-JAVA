package abstract_class;

//Abstract class 
abstract class Shape {
 // Abstract method 
 public abstract double calculateArea();
}


//Subclass Circle extends shape
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
//Method to calculate the area of a circle
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}


//Subclass Rectangle
class Rectangle extends Shape {
 private double length;
 private double breadth;

 public Rectangle(double length, double breadth) {
     this.length = length;
     this.breadth = breadth;
 }

//Method to calculate the area of a rectangle
 @Override
 public double calculateArea() {
     return length * breadth;
 }
}

public class FindArea {
 public static void main(String[] args) {
     Circle cir = new Circle(7);
     Rectangle rec = new Rectangle(3, 6);

     System.out.println("Area of the Circle: " + cir.calculateArea());
     System.out.println("Area of the Rectangle: " + rec.calculateArea());
 }
}

//-------- OUTPUT -------------------------------------------------------

// Area of the Circle: 153.93804002589985
// Area of the Rectangle: 18.0

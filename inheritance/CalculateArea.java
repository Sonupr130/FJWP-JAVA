package inheritance;

class Shape {
    // Method to calculate and return the area to be overridden by subclasses
    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private int radius;

    // Constructor for Circle class
    public Circle(int radius) {
        this.radius = radius;
    }

    // Override the getArea() method for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private int length;

    // Constructor for square class
    public Square(int length) {
        this.length = length;
    }

    // Override the getArea() method for Square
    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor for rectangle class
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override the getArea() method for rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Circle cr = new Circle(5);
        Square sq = new Square(4);
        Rectangle rec = new Rectangle(4, 8);

        // Calculate and print the areas
        System.out.println("Area of Circle: " + cr.getArea());
        System.out.println("Area of Square: " + sq.getArea());
        System.out.println("Area of Rectangle: " + rec.getArea());
    }
}

//------------- OUTPUT ----------------------------------------------------

//Area of Circle: 78.53981633974483
//Area of Square: 4.0
//Area of Rectangle: 18.0



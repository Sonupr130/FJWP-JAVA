package inheritance;

class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor for the Vehicle class
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method to drive the vehicle
    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }

    // Method to display vehicle 
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Maximum Speed: " + maximumSpeed);
    }
}

// Subclass Car extending the Vehicle class
class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);     // Call the superclass constructor using super keyword
    }

    // Override the drive method to print a message
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

// Subclass Bike extending the Vehicle class
class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override the drive method to print a message
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Car car = new Car("Hyundai", "Verna Sx", 2023, 180);
        Bike bike = new Bike("KTM", "Duke 250", 2018, 200);

        // Display attributes of Car and Bike
        System.out.println("Car Attributes:");
        car.display();
        System.out.println("\nBike Attributes:");
        bike.display();

        System.out.println("\nCalling drive method:");
        car.drive();
        bike.drive();
    }
}

//------------- OUTPUT ----------------------------------------------------

/*
Car Attributes:
Make: Hyundai
Model: Verna Sx
Year: 2023
Maximum Speed: 180

Bike Attributes:
Make: KTM
Model: Duke 250
Year: 2018
Maximum Speed: 200

Calling drive method:
Hyundai Verna Sx Car is driving.
KTM Duke 250 Bike is driving.

*/


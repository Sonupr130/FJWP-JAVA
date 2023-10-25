package class_constructor;

//Super class
class Vehicle {
 void start() {
     System.out.println("Vehicle started");
 }
}

//Subclass Car
class Car extends Vehicle {
 void start() {
     System.out.println("Car started");
 }
}

//Subclass Motorcycle
class Motorcycle extends Vehicle {
 void start() {
     System.out.println("Motorcycle started");
 }
}

//Garage class
class Garage {
 void serviceVehicle(Vehicle vehicle) {
     vehicle.start();
     System.out.println("Vehicle serviced");
 }
}

public class Main {
 public static void main(String[] args) {
     // Create instances of Car and Motorcycle
     Car car = new Car();
     Motorcycle motorcycle = new Motorcycle();
     
     // Create an instance of Garage
     Garage garage = new Garage();

     // Call serviceVehicle() with instances of both Car and Motorcycle
     System.out.println("Servicing the Car:");
     garage.serviceVehicle(car);

     System.out.println("\nServicing the Motorcycle:");
     garage.serviceVehicle(motorcycle);
 }
}

//------------- OUTPUT -----------------------------

//Servicing the Car:
//Car started
//Vehicle serviced
//
//Servicing the Motorcycle:
//Motorcycle started
//Vehicle serviced


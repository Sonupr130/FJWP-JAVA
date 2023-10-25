package classes;

import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private short year;
    private int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        short year = scanner.nextShort();

        System.out.print("Enter the price of the car: ");
        int price = scanner.nextInt();

        // Create a Car object
        Car car = new Car(make, model, year, price);

        System.out.println("\nCar Information:");
        car.displayCarInfo();

        scanner.close();
    }
}

//--------------OUTPUT-------------

//Enter the make of the car: Hyundai
//Enter the model of the car: Verna
//Enter the year of the car: 2018
//Enter the price of the car: 1000000

//Car Information:
//Car Make: Hyundai
//Car Model: Verna
//Car Year: 2018
//Car Price: 1000000

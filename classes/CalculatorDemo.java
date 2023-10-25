package classes;

import java.util.Scanner;

import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Method Overloading Example: Calculator");
        System.out.println("1. Add two integers");
        System.out.println("2. Add three integers");
        System.out.println("3. Add two doubles");
        System.out.print("Enter your choice (1/2/3): ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the first integer: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int num2 = scanner.nextInt();
                int result = calculator.add(num1, num2);
                System.out.println("Sum of two integers: " + result);
                break;
            case 2:
                System.out.print("Enter the first integer: ");
                int num3 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int num4 = scanner.nextInt();
                System.out.print("Enter the third integer: ");
                int num5 = scanner.nextInt();
                int result2 = calculator.add(num3, num4, num5);
                System.out.println("Sum of three integers: " + result2);
                break;
            case 3:
                System.out.print("Enter the first double: ");
                double num6 = scanner.nextDouble();
                System.out.print("Enter the second double: ");
                double num7 = scanner.nextDouble();
                double result3 = calculator.add(num6, num7);
                System.out.println("Sum of two doubles: " + result3);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

//     OUTPUT

//Method Overloading Example: Calculator
//1. Add two integers
//2. Add three integers
//3. Add two doubles
//Enter your choice (1/2/3): 1
//Enter the first integer: 12
//Enter the second integer: 34
//Sum of two integers: 46

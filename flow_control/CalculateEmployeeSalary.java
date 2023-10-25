package flow_control;

import java.util.Scanner;

public class CalculateEmployeeSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int choice = 0;
//        while (choice != -1) {
//            System.out.print("Enter the basic salary of the employee: ");
//            double basicSalary = scanner.nextDouble();
//
//            double grossSalary = calculateGrossSalary(basicSalary);
//            System.out.println("Gross Salary: " + grossSalary);
//
//            System.out.print("Enter -1 to exit, or any other number to calculate for another employee: ");
//            choice = scanner.nextInt();
//        }
        int choice = scanner.nextInt();       
        while(true) {
        	System.out.print("Enter the basic salary of the employee: ");
            double basicSalary = scanner.nextDouble();

            double grossSalary = calculateGrossSalary(basicSalary);
            System.out.println("Gross Salary: " + grossSalary);
        	if(choice == -1) {
        		System.out.println("Exit");
        		break;
        	}
        }

        scanner.close();
    }

    // Method to calculate gross salary 
    public static double calculateGrossSalary(double basicSalary) {
        double hra;
        double da;

        if (basicSalary > 15000) {
            hra = 0.20 * basicSalary;
            da = 0.60 * basicSalary;
        } else {
            hra = 3000;
            da = 0.70 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;
        return grossSalary;
    }
}

//------------- OUTPUT -----------------------------

//Gross Salary: 144000.0
//Enter -1 to exit, or any other number to calculate for another employee: 3
//Enter the basic salary of the employee: 60000
//Gross Salary: 108000.0
//Enter -1 to exit, or any other number to calculate for another employee: 

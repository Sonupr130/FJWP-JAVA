package flow_control;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        // User enter the time period 
        System.out.print("Enter the time period in years: ");
        double time = sc.nextDouble();

        double interestRate;

        // Check the interest rate based on principle amount
        if (principal > 10000) {
            interestRate = 0.10; // 10%
        } else if (principal >= 5000) {
            interestRate = 0.08; // 8%
        } else {
            interestRate = 0.05; // 5%
        }

        // Calculate simple interest
        double simpleInterest = (principal * interestRate * time);


        // Display the result
        System.out.println("Principal Amount (P): " + principal);
        System.out.println("Time Period (T): " + time + " years");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Simple Interest: " + simpleInterest);
        
        sc.close();
    }
}

// *********** OUTPUT **************

//Enter the principal amount: 4000
//Enter the time period in years: 1
//Principal Amount (P): 4000.0
//Time Period (T): 1.0 years
//Interest Rate: 5.0%
//Simple Interest: 200.0

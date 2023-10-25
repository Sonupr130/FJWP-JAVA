package exception_handling;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String args[]) {
		
		
        // Declare variables to store user input and create a Scanner object for input
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
        // Prompt user for the first number
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		
        // Prompt user for the second number
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		
		System.out.println("Enter Operation(+, -, *, /): ");
		char operator = sc.next().charAt(0);	
		
		
		
		try {
			// Perform the arithmetic operation based on the operator
			switch(operator) {
			case '+':
				int sum = num1 + num2;
				System.out.println("Addition of " + num1 + " and " + num2 + " is: " +sum);
				break;
				
			case '-':
				int sub = num1 - num2;
				System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " +sub);
				break;
				
			case '*':	
				int mul = num1 * num2;
				System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " +mul);
				break;
				
			case '/':	
				int div = num1 / num2;
				System.out.println("Addition of " + num1 + " and " + num2 + " is: " +div);
				break;
				
				default:
					System.out.println("Invalid Operator, Plz try again");
			}
		}catch(ArithmeticException e){
			System.out.println("Error: " + e.getMessage());
		}catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}finally {
			sc.close();
		}	
	}
}

//-------- OUTPUT ---------------------------------------------------

/* Enter the first number: 
   26
   Enter the second number: 
   63
   Enter Operation(+, -, *, /): 
   +
   Addition of 26 and 63 is: 89

*/
package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleUserInput {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter an integer: ");
			int num = sc.nextInt();
			System.out.println("Entered Number: " + num);
			
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid Input! plz enter an integer");
			
		} 
		finally {
			sc.close();
		}
	}
}

/* --- OUTPUT ----------------------------------------------------

// Handling InputMismatchException taking non-integer number
Enter an integer: 
g
Invalid Input plz enter an integer!

// Taking integer number
Enter an integer: 
43
Entered Number: 43


*/
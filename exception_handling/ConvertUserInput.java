package exception_handling;

import java.util.Scanner;

public class ConvertUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number as a string: ");
            String userInput = sc.nextLine();

            // Convert the user input to an integer using Integer.parseInt()
            int convertedValue = Integer.parseInt(userInput);

            // If successful, print the converted integer
            System.out.println("Converted integer: " + convertedValue);
        } 
        catch (NumberFormatException e) {
            // Handle NumberFormatException if the input cannot be converted to an integer
            System.out.println("Invalid input. Please enter a valid integer as a string.");
        } 
        catch (NullPointerException e) {
            System.out.println("Input is null. Please enter a valid string.");
        } finally {
            sc.close();
        }
    }
}

/*--- OUTPUT ------------------------------------

// Handling NumberFormatException input cannot be converted to an integer
   Enter a number as a string: sonu
   Invalid input. Please enter a valid integer as a string.

    It successful print the converted integer
    Enter a number as a string: 82
    Converted integer: 82

*/

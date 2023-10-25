package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int num = scanner.nextInt();

        // Create an array of integers with the specified size
        int[] arr = new int[num];

        // Input the elements of the array from the user
        System.out.println("Enter the elements of the array:");

        for (int i=0; i<num; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int i=0; i<num; i++) {
            sum += arr[i];
        }

        // Calculate the average
        double average = (double) sum/num;

        // Output the sum and average
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        // Close the scanner
        scanner.close();
    }
}

//------------- OUTPUT -----------------------------

//Enter the number of elements in the array: 3
//Enter the elements of the array:
//Element 1: 12
//Element 2: 12
//Element 3: 45
//Sum of elements: 69
//Average of elements: 23.0



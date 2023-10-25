package Arrays;

import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int num = sc.nextInt();

        // Create an array to store the elements
        int[] arr = new int[num];

        // Input the elements of the array from the user
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < num; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Using bubble sort to sort the array in ascending order
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}

//------------- OUTPUT ------------------------------------------

//Enter the number of elements in the array: 3
//Enter the elements of the array: 
//Element 1: 45
//Element 2: 34
//Element 3: 23
//Sorted Array in Ascending Order:
//23 34 45 


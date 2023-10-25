package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ThreeDArray {

    // Initialize the 3d array with random values
    public static void initializeArray(int[][][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(100);
                }
            }
        }
    }

    // Display the 3D array
    public static void displayArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Levels " + i + " :");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Find and display the maximum value in the 3D array
    public static void maximumValue(int[][][] array) {
        int max = array[0][0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Maximum Value: " + max);
    }

    // Method to calculate the average of all elements in the array
    public static double averageValue(int[][][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    sum += array[i][j][k];
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0.0; // To avoid division by zero if the array is empty
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][][] threeDArray = new int[levels][rows][cols];

        System.out.println("Initializing 3D Array: ");
        initializeArray(threeDArray);

        displayArray(threeDArray);

        maximumValue(threeDArray);

        System.out.println("Average Value: " + averageValue(threeDArray));
    }
}

//-------- OUTPUT -----------------------------------------------------

/*
Enter the number of levels: 3
Enter the number of rows: 3
Enter the number of columns: 3
Initializing 3D Array: 
Levels 0 :
90 81 56 
70 68 49 
81 36 70 

Levels 1 :
5 1 80 
9 7 95 
77 81 34 

Levels 2 :
90 6 54 
49 51 54 
0 4 48 

Maximum Value: 95
Average Value: 49.851851851851855

*/





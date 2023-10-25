package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ThreeDimensionalArray {

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

//-------- OUTPUT --------------


//Enter the number of levels: 3
//Enter the number of rows: 4
//Enter the number of columns: 4
//Initializing 3D Array: 
//Levels 0 :
//93 65 69 64 
//93 71 6 66 
//40 22 76 96 
//32 64 46 30 
//
//Levels 1 :
//66 77 55 16 
//54 44 38 73 
//17 88 71 74 
//83 40 24 4 
//
//Levels 2 :
//71 47 61 94 
//22 60 34 80 
//55 49 6 25 
//66 91 81 88 
//
//Maximum Value: 96
//Average Value: 55.979166666666664






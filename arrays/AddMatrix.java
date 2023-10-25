package Arrays;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Initialize the matrices
        Integer[][] matrix1 = new Integer[rows][columns];
        Integer[][] matrix2 = new Integer[rows][columns];

        System.out.println("Enter the elements of the first matrix:");
        initializeMatrix(matrix1, sc);

        System.out.println("Enter the elements of the second matrix:");
        initializeMatrix(matrix2, sc);

        // Perform matrix addition
        Integer[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resulting Matrix after addition:");
        displayMatrix(resultMatrix);

        sc.close();
    }

    // Initialize a matrix with user input
    public static void initializeMatrix(Integer[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Perform addition of two matrices
    public static Integer[][] addMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        Integer[][] resultMatrix = new Integer[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Display a matrix
    public static void displayMatrix(Integer[][] matrix) {
        for (Integer[] row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

//-------- OUTPUT --------------

//Enter the number of rows: 4
//Enter the number of columns: 4
//Enter the elements of the first matrix:
//1
//34
//45
//65
//45
//36
//54
//34
//56
//43
//567
//54
//3
//45
//67
//54
//Enter the elements of the second matrix:
//34
//56
//45
//67
//53
//23
//67
//86
//45
//34
//67
//54
//34
//56
//67
//87
//Resulting Matrix after addition:
//35 90 90 132 
//98 59 121 120 
//101 77 634 108 
//37 101 134 141 


package Arrays;

import java.util.Scanner;

public class MatrixAddition {
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

//-------- OUTPUT -----------------------------------------------------

/*
Enter the number of rows: 3
Enter the number of columns: 3
Enter the elements of the first matrix:
1
2
3
4
5
6
7
8
9
Enter the elements of the second matrix:
10
11
12
13
14
15
16
17
18
Resulting Matrix after addition:
11 13 15 
17 19 21 
23 25 27 

*/

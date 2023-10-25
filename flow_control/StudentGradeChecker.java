package flow_control;

import java.util.Scanner;

public class StudentGradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables to store marks and total marks
        double totalMarks = 0;
        double averageMarks;

        // The user enter marks for each subject
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = sc.nextDouble();

            // Validate that marks are between 0 and 100
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100. Please re-enter.");
                i--; // Decrement i to re-enter marks for the same subject
                continue;
            }

            // Add the marks to the total
            totalMarks += marks;
        }

        // Calculate the average marks
        averageMarks = totalMarks / 5;
        
        sc.close();

        // Display the total marks and average marks
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // Assign grades based on average marks
        String grade;
        if (averageMarks > 90) {
            grade = "Ex";
        } else if (averageMarks > 80) {
            grade = "A";
        } else if (averageMarks > 60) {
            grade = "B";
        } else if (averageMarks >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Display the grade
        System.out.println("Grade: " + grade);
    }
}

// -------- OUTPUT ------------------------

//Enter marks for Subject 1: 8
//Enter marks for Subject 2: 4
//Enter marks for Subject 3: 65
//Enter marks for Subject 4: 23
//Enter marks for Subject 5: 98
//Total Marks: 198.0
//Average Marks: 39.6
//Grade: F


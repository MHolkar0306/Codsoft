package Grade_Calculator;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int subjectMarks = scanner.nextInt();

            // Validate marks (assuming marks are out of 100)
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100. Exiting.");
                return;
            }

            totalMarks += subjectMarks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " +grade);
	}
}

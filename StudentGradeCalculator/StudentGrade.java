package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGrade {

        Scanner sc = new Scanner(System.in);

public void marks() {
        // Input the number of subjects
        System.out.println("Enter the number of subjects: ");
        int num = sc.nextInt();
     // Array to store marks of each subject
        int[] marks = new int[num];
        // Initialize total marks variable
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < num; i++) {
            System.out.print("Enter marks(out of 100) obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];  // Sum of marks
            
            // Check if the marks are within the valid range (0-100)
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                totalMarks += marks[i];  // Sum of marks
            }
        }
        // Calculate average percentage
        double percent = (double) totalMarks / num;

        // Display the results
        System.out.println("\n-----Results-----");
        System.out.println("Total Marks: " + totalMarks + " out of " + (num * 100));
        System.out.println("Average Percentage: " +  percent + "%");
        System.out.println("Grade: " +  Grade(percent));

}  


//Method to calculate grade based on average percentage
public static String Grade(double percent) {
    if (percent >= 90) {
        return "A+";
    } else if (percent >= 80) {
        return "A";
    } else if (percent >= 70) {
        return "B";
    } else if (percent>= 60) {
        return "C";
    } else if (percent >= 50) {
        return "D";
    } else {
        return "F";
    }
}
    }

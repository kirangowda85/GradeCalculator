import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grade Calculator");

        
        int numSubjects;
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        int[] subjectMarks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        
        int totalMarks = calculateTotalMarks(subjectMarks);

     
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

       
        char grade = calculateGrade(averagePercentage);

       
        displayResults(totalMarks, averagePercentage, grade);
    }

    private static int calculateTotalMarks(int[] subjectMarks) {
        int totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }
        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    private static char calculateGrade(double averagePercentage) {
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
        return grade;
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}


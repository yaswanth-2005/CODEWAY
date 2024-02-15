import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[][] scores = new double[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter scores for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter score for subject " + (j + 1) + ": ");
                scores[i][j] = scanner.nextDouble();
            }
        }

        double[] averages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += scores[i][j];
            }
            averages[i] = sum / numSubjects;
        }

        System.out.println("\nStudent\tAverage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" + averages[i] + "\t" + getGrade(averages[i]));
        }

        scanner.close();
    }

    private static char getGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

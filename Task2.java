import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        int totalMarks = 0;
        double averagePercentage;
        String grade;
        int numberOfSubjects = 7;
        String[] subjectNames = {"Mathematics", "English", "Natural Science", "History", "Art and Culture", "Physical Education", "Computer Science"};
        int[] subjectMarks = new int[numberOfSubjects];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Please enter your marks for " + subjectNames[i] + ": ");
            subjectMarks[i] = scanner.nextInt();
            totalMarks += subjectMarks[i];
        }

        // Calculate averagePercentage and assign grade
        averagePercentage = (double) totalMarks / numberOfSubjects;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else if (averagePercentage >= 40) {
            grade = "F";
        } else {
            grade = "Invalid Grade";
        }

        // Display results
        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println(subjectNames[i] + ": " + subjectMarks[i]);
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}

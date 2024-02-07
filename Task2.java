import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        int totalMarks = 0;
        double averagePercentage;
        String grade;
        int numberOfSubjects = 7;
        int[] subjectMarks = new int[numberOfSubjects];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Please enter your marks for subject " + (i + 1) + ": ");
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
                }


        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}

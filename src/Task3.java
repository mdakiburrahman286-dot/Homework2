import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int students = sc.nextInt();

        double[] averages = new double[students];
        double groupSum = 0;
        double highest = 0;

        boolean[] hasBelow5 = new boolean[students];

        for (int i = 0; i < students; i++) {
            int sum = 0;

            for (int j = 0; j < subjects; j++) {
                int grade = sc.nextInt();
                sum += grade;

                if (grade < 5) {
                    hasBelow5[i] = true;
                }
            }

            averages[i] = (double) sum / subjects;
            groupSum += averages[i];

            if (averages[i] > highest) {
                highest = averages[i];
            }
        }

        // Student averages
        System.out.println("Student averages:");
        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d: %.2f%n", i + 1, averages[i]);
        }

        // Group average
        System.out.printf("Group average: %.2f%n", groupSum / students);

        // Highest average
        System.out.print("Highest average student(s): ");
        for (int i = 0; i < students; i++) {
            if (averages[i] == highest) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();

        // Students with grade below 5
        System.out.print("Below 5: ");
        boolean found = false;

        for (int i = 0; i < students; i++) {
            if (hasBelow5[i]) {
                System.out.print((i + 1) + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}

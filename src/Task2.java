import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;
        int leftSum = 0;
        int rightSum = 0;

        int leftCount = 0;
        int rightCount = 0;

        for (int i = 1; i <= n; i++) {
            int residents = sc.nextInt();

            total += residents;

            if (i % 2 == 1) {
                leftSum += residents;
                leftCount++;
            } else {
                rightSum += residents;
                rightCount++;
            }
        }

        System.out.println("Total residents: " + total);
        System.out.println("Left side residents: " + leftSum);
        System.out.println("Right side residents: " + rightSum);

        if (leftCount > 0)
            System.out.println("Left average: " + (double) leftSum / leftCount);
        else
            System.out.println("Left average: N/A");

        if (rightCount > 0)
            System.out.println("Right average: " + (double) rightSum / rightCount);
        else
            System.out.println("Right average: N/A");
    }
}
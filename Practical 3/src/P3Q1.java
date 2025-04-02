import java.util.Scanner;

public class P3Q1 {

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int numScores = scannerA.nextInt();

        double[] scores = new double[numScores];

        for (int i = 0; i < numScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scannerA.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < numScores; i++) {
            total += scores[i];
        }

        double avrg = total / numScores;

        int aboveOrEqualAvrg = 0;
        int belowAvrg = 0;

        for (int i = 0; i < numScores; i++) {
            if (scores[i] >= avrg) {
                aboveOrEqualAvrg++;
            } else {
                belowAvrg++;
            }
        }

        System.out.println("\nResults");
        System.out.println("=======");
        System.out.printf("Average is %.1f\n", avrg);
        System.out.println("Number of scores above or equal to the average is " + aboveOrEqualAvrg);
        System.out.println("Number of scores below the average is " + belowAvrg);

        scannerA.close();
    }
}

public class practice1 {

    public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner(System.in);
       System.out.print("Enter a number of quiz scores to process: ");
       int totalScores = input.nextInt();
       System.out.println();

       double[] scores = new double[totalScores];
       double sum = 0;

       for (int i = 0; i < scores.length; i++) {
           System.out.print("Score " + (i + 1) + ": ");
           scores[i] = input.nextDouble();
           sum += scores[i];
       } 

       double average = sum / scores.length;

       int numOfAbove = 0;
       int numOfBelow = 0;
       for (int i = 0; i < scores.length; i++) {
           if (scores[i] >= average) {
               numOfAbove++;
           } else {
               numOfBelow++;
           }
       }

       System.out.println("\nResults");
       System.out.println("=======");
       System.out.printf("Average is %.1f\n", average);
       System.out.println("Number of scores above or equal to the average is " + numOfAbove);
       System.out.println("Number of scores below the average is " + numOfBelow);

       input.close();
    }

    
}

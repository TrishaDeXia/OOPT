public class practice4 {
    public static void main(String[] args) {
        System.out.println("Average of 2 and 4 : " + calculateAverage(2,4));

        System.out.println("Average of 2, 4 and 6 : " + calculateAverage(2, 4, 6) );

        System.out.println("Average of 2.5 and 4.5 : " + calculateAverage(2.5, 4.5));

        System.out.println("Average of 2.5, 4.5 and 6.5 : " + calculateAverage(2.5, 4.5, 6.5) );
    }

    public static double calculateAverage(int a, int b) {
        int Average = (a + b) / 2;
        return Average;
        
    }

    public static double calculateAverage(int a, int b , int c) {
        int Average = (a + b + c) / 3;
        return Average;
    }

    public static double calculateAverage(double a, double b) {
        double Average = (a + b) / 2.0;
        return Average;
    }

    public static double calculateAverage(double a, double b , double c) {
        double Average = (a + b + c) / 3.0;
        return Average;
    }
}
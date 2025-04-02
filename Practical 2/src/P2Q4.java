public class P2Q4 {
    public static void main(String[] args) {
        System.out.println("Average of 2 integers (5, 9): " + calculateAverage(5, 9));

        System.out.println("Average of 3 integers (5, 9, 24): " + calculateAverage(5, 9, 24));

        System.out.println("Average of 2 doubles (10.5, 20.5): " + calculateAverage(10.5, 20.5));

        System.out.println("Average of 3 doubles (10.5, 20.5, 30.5): " + calculateAverage(10.5, 20.5, 30.5));
    }

    public static double calculateAverage(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double calculateAverage(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}
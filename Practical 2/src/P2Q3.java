public class P2Q3 {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-10s %-20s %-15s %-10s\n\n", "Celcius", "Ferenheit", "Ferenheit", "Celcius");

        for (double i = 0; i <= 50d; i += 10) {
            System.out.printf("%-10.1f %-20.4f %-15.1f %-10.4f\n", (double) i, celciusToFerenheit(i), (double) (i + 50),
                    fahrenheitToCelcius(i + 50));
        }
    }

    public static double celciusToFerenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}

public class practice3 {
    public static void main(String[] args) {
        System.out.println("Celcius\t Fahrenheit\t  Fahrenheit \t  Celcius\n");

        for (double i = 0; i <= 50; i += 10) {
            System.out.printf("%-10.1f %-20.4f %-15.1f %-10.4f\n", i, celciusToFahrenheit(i), i + 50, fahrenheitToCelcius(i + 50));
        }
        
    }

    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius;
    }
    }

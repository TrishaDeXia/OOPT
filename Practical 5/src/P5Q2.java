import java.util.Scanner;

public class P5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String newString = input.toUpperCase();

        newString = newString.replaceAll("[AEIOU]", "X");

        System.out.println("Modified string:" + newString);
        
        scanner.close();
    }
}

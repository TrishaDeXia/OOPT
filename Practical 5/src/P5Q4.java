import java.util.Scanner;

public class P5Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a product code: ");
        String productCode = scanner.nextLine();

        boolean invalid = false;
        if (productCode.length() != 8)
            invalid = true;

        for (int i = 0; i < productCode.length(); i++) {
            char ch = productCode.charAt(i);

            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                invalid = true;
                break;
            } else if (i < 2) {
                if (Character.isDigit(ch) == false || Character.isUpperCase(ch) == false) {
                    invalid = true;
                    break;
                }
            } else if (Character.isDigit(ch) == false) {
                invalid = true;
                break;
            }

        }

        if (invalid) {
            System.out.println("Invalid Product Code");
        } else {
            System.out.println("Valid Product Code!");
        }

        scanner.close();
    }

}

import java.util.Scanner;

public class P3Q3 {

    public static String[] items = {"Apples", "Bananas", "Oranges", "Grapes", "Mangoes"};

    public static double[] unitCosts = {2.00, 2.00, 2.50, 5.00, 5.00};

    public static void main(String[] args) {

        int[] quantities = new int[items.length];
        
        Scanner scannerB = new Scanner(System.in);

        System.out.println("Item\t Quantity");

        for (int i = 0; i < items.length; i++) {
            System.out.print("" + items[i] + " ");
            quantities[i] = scannerB.nextInt();
        }

        System.out.println("\nItem\t Quantity\t Value (MYR)");

        double totalValue = 0.0;

        for (int i = 0; i < items.length; i++) {  
            if (quantities[i] > 0) {
 
                double value = quantities[i] * unitCosts[i];
            
                System.out.printf("%-15s%-10d%.2f\n", items[i], quantities[i], value);
                
                totalValue += value;
            }
        }

        System.out.printf("\nTotal value: %.2f MYR\n", totalValue);
        
        scannerB.close();
    }
}

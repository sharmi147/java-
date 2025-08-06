import java.io.*;
import java.util.*;

public class Budget {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        
        int cost1 = sc.nextInt();
        int quantity1 = sc.nextInt();
 
       
        int cost2 = sc.nextInt();
        int quantity2 = sc.nextInt();

      
        int cost3 = sc.nextInt();
        int quantity3 = sc.nextInt();

        int budget = sc.nextInt();

        int totalBeforeTax = (cost1 * quantity1) + (cost2 * quantity2) + (cost3 * quantity3);

        
        double totalAfterTax = totalBeforeTax * 1.10;

       
        System.out.printf("Total (Before Tax): %.2f\n", (double) totalBeforeTax);
        System.out.printf("Total (After Tax): %.2f\n", totalAfterTax);

       
        if (totalAfterTax <= budget) {
            System.out.println("Within Budget");
        } else {
            System.out.println("Over Budget");
        }
    }
}

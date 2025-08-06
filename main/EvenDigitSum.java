import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int evenSum = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            num /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
    } 
}

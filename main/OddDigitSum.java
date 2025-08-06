import java.util.Scanner;

public class OddDigitSum {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int oddSum = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0)
                oddSum += digit;
            num /= 10;
        }

        System.out.println("Sum of odd digits: " + oddSum);
    } 
}

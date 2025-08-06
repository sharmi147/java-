import java.util.*;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();

        boolean found = false; // tracks if any prime was printed

        for (int i = start; i <= end; i++) {
            if (i < 2) continue;
            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found)
            System.out.println("No prime numbers");
    }
}

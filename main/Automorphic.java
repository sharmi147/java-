import java.util.Scanner;

public class Automorphic {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int sq = n * n;

	        String numStr = String.valueOf(n);
	        String sqStr = String.valueOf(sq);

	        if (sqStr.endsWith(numStr)) {
	            System.out.println("Automorphic");
	        } else {
	            System.out.println("Not Automorphic");
	        }
	    }
	

}


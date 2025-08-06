import java.util.Scanner;

public class great {
    	public static void main(String[] args) {
       
		        Scanner s=new Scanner(System.in);
		        int a=s.nextInt();
		        int b=s.nextInt();
		        int c=s.nextInt();
		        

		        if (a > b) {
		            if (a > c) {
		                System.out.println("Greatest number is: " + a);
		            } else {
		                System.out.println("Greatest number is: " + c);
		            }
		        } else {
		            if (b > c) {
		                System.out.println("Greatest number is: " + b);
		            } else {
		                System.out.println("Greatest number is: " + c);
		            }
		        }
		        s.close();
		    }
}

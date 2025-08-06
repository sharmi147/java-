import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner s=new Scanner(System.in);
	        int a=s.nextInt();
	        int b=s.nextInt();
	        int c=gcd(a,b);
	    System.out.println(c);
	    s.close();
	    }
	    public static int gcd(int a,int b){
	     while(b!=0){ int temp=b;//t=18  t=12  6
	        b=a%b;//12%18=12b=12  18%12=6  12%6=0
	        a=temp;//a=18  12 
	    }return a;}
}

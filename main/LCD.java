import java.io.*;
import java.util.*;

public class LCD {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=a*b/gcd(a,b);
        System.out.println(c);
        }
        public static int gcd(int a,int b){
         while(b!=0){ int temp=b;
            b=a%b;
            a=temp;
        }return a;}

    
}

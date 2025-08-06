import java.io.*;
import java.util.*;

public class SumAndFactor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum =0,fact=1;
        for(int i=1;i<=n;i++) {
           fact=fact*i;
        }
        
        for(int i=0;i<=n;i++) {
            sum=sum+i;
        }
        System.out.println(sum);
         System.out.println(fact);
    }
}

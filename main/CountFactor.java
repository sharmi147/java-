import java.io.*;
import java.util.*;

public class CountFactor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0)   count++;
        }
         
     System.out.print(count); }
        
}

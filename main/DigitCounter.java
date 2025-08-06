import java.io.*;
import java.util.*;

public class DigitCounter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner s= new Scanner (System.in);
        int n=s.nextInt();
        n=Math.abs(n);
        int c=0,rem=0;
        if(n==0) c=1;
        else{
        while(n!=0){
            rem=n%10;
            c++;
            n/=10;
            
        }  }System.out.println(c);
    }
}

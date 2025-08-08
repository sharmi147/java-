import java.io.*;
import java.util.*;

public class Rev {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int no=Math.abs(n);
        int rem=0,rev=0;
        while(no!=0){
            rem=no%10;
            rev=rev*10+rem;
            no/=10;
            }
        if(n>=0)
        System.out.println(rev);
        else
             System.out.println((-1)*rev);
    }
}

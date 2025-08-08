import java.io.*;
import java.util.*;

public class SumOf {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n=Math.abs(n);
        int sum=0,rem;
       while(n!=0){
           rem=n%10;
           sum+=rem;
           n/=10;
       }
        System.out.println(sum);
    }
}

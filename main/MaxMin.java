import java.io.*;
import java.util.*;

public class MaxMin {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n=Math.abs(n);
        int rem=0,g=0,sm=9;
        if(n==0) sm=g=0;
        else{
        while(n!=0){
             rem=n%10;
            if(g<rem) 
                g=rem;
            else if(sm>rem)
                sm=rem;
            
            n/=10;
        }}
        System.out.println(g+" "+sm);
    }
}

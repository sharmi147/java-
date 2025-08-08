import java.io.*;
import java.util.*;

public class StartEnd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=Math.abs(s.nextInt());
       
        int start=n%10;
        while(n>=10){
           
            n/=10;
        }
        System.out.println(start+n);
    }
}

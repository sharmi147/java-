import java.io.*;
import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
              Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0) System.out.println("Even");
        
        else System.out.println("Odd");
    }
}

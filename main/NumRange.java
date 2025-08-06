import java.io.*;
import java.util.*;

public class NumRange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>0) System.out.println("Positive");
        else  if(n<0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}

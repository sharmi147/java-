import java.io.*;
import java.util.*;

public class CharIdentify {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s=new Scanner(System.in);
        char in=s.nextLine().charAt(0);
        if(in>='A' && in<='Z') System.out.println("Uppercase Alphabet  ");
        else if(in>='a' && in<='z') System.out.println("Lowercase Alphabet  ");
         else if(in>='0' && in<='9') System.out.println("Digit ");
        else System.out.println("Special Character");
    }
}

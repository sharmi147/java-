import java.io.*;
import java.util.*;

public class Float2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s=new Scanner(System.in);
        String na=s.nextLine().trim();
        int foll=s.nextInt();
        int post=s.nextInt();
        float hr=s.nextFloat();
        System.out.printf("My name is "+ na +", my Instagram has "+foll+" followers, I have posted "+post+" posts, and I use Instagram for "+hr+" hours daily.");
    }
}

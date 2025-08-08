import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
                Scanner s =new Scanner(System.in);
        int n=s.nextInt();
         int no=n;
        int rem=0,rev=0;
        if(no>0){
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
            }
        if(no==rev)
        System.out.println("true");
        else
             System.out.println("false");}
          else
             System.out.println("false");
        
        
    }
}

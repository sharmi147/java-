import java.io.*;
import java.util.*;

public class sumProduct {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,pro=1,rem=0;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        if(sum==pro) System.out.println("Spy Number");
        else System.out.println("Not a Spy Number");

    }
}

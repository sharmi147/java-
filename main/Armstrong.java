import java.io.*;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int no=n;
        int digLen=String.valueOf(n).length();
        
        int sum=0,rem=0;
        while(n!=0){
            rem=n%10;
            sum+=Math.pow(rem,digLen);
            n/=10;
        }
        if(sum==no) System.out.println(true);
        else System.out.println(false);
    }
}

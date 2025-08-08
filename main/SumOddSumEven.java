import java.io.*;
import java.util.*;

public class SumOddSumEven {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n=Math.abs(n);
        int rem=0,sumO=0,sumE=0;
        while(n!=0){
            rem=n%10;
            if(rem%2==0) sumE+=rem;
            else sumO+=rem;
            n/=10;
        }
        System.out.println(sumO+" "+sumE);
    }
}

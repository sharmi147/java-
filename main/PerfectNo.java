import java.io.*;
import java.util.*;

public class PerfectNo {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int pro=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            pro+=i; 
        }
    }
        if(pro==n) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect Number");
    }
}

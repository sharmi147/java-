import java.io.*;
import java.util.*;

public class Power {

    public static void main(String[] args) {
   
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
        int p=s.nextInt();
    int pro=1;
        if(p==0) { System.out.println(1);}
        else{
    for(int i=1;i<=p;i++){
        
            pro=pro*n; 
        }
 System.out.println(pro);}
        
    }
}

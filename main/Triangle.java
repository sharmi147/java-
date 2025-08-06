import java.io.*;
import java.util.*;

public class Triangle {

    public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
     if((a+b>c) && (b+c>a)  &&  (c + a > b)){
         
         if(a==b && a==c){
             System.out.println("Equilateral Triangle ");
         }else if(a==b || a==c  || b==c){
             System.out.println("Isosceles Triangle ");
         }else if(a!=b && b!=c && c!=b){
             System.out.println("Scalene Triangle ");
         }
     }else{
          System.out.println("Not a valid triangle ");
     }
    
    
    }
}

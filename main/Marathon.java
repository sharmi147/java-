import java.io.*;
import java.util.*;

public class Marathon {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int fs=sc.nextInt();
        if(age>=18 && fs>=60){
            System.out.println("Eligible for marathon");
        }
        else{
           System.out.println("Not eligible for marathon"); 
        }
        
    }
}

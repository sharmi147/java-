import java.io.*;
import java.util.*;

public class ATM {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        sc.nextLine();
        String acc=sc.nextLine().trim();
        if(amt%100==0 && acc.equals("available")){
            System.out.println("Amount "+amt+" can be withdrawn");
        }else if(amt%500==0 && acc.equals("not available")){
              System.out.println("Amount "+amt+" can be withdrawn");
        }
        else{
         System.out.println("Enter amount in multiples of 500");   
        }
        sc.close();
    }
}

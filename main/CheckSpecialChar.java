import java.util.Scanner;

public class CheckSpecialChar {
   	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       char sp=s.nextLine().charAt(0);
       boolean cap=(sp>='A' && sp<='Z');
       boolean sma=(sp>='a' && sp<='b');
       boolean dig=(sp>='0' && sp<='9');
       boolean rs=(cap||sma|| dig);
       System.out.println(!rs);
       s.close();
       
} 
}

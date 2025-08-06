import java.util.Scanner;

public class Char {
   public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	       char sp=s.nextLine().charAt(0);
	      if(sp>='A' && sp<='Z') System.out.println("caps");
	      else if(sp>='a' && sp<='z') System.out.println("low");
	      else if(sp>='0' && sp<='9') System.out.println("digit");
	      else
	       System.out.println("spe char");
	       s.close();

	} 
}

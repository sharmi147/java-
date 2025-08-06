import java.util.Scanner;

public class cgpascan {
     public static void main(String[] args) {
	   Scanner cg=new Scanner(System.in);
	   float a =cg.nextFloat();//9.0 "\n this will be read by so we need another cg.nectline()
	   int ag=cg.nextInt();
	   cg.nextLine();
	   String name=cg.nextLine();
	   System.out.println("Name: "+ name);
	   System.out.println("Age: "+ ag);
	   System.out.println("CGPA: "+a);
	   cg.close();
	   }
}

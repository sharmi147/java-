import java.io.*;
import java.util.*;

public class FloatNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        float h=sc.nextFloat();
        sc.nextLine();
        String name=sc.nextLine();
        System.out.printf("%s is %d years old and %.2f meters tall.%n", name, age, h);
    }
}

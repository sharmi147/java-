import java.io.*;
import java.util.*;

public class TeamMembers {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int mem=scan.nextInt();
        int grp=scan.nextInt();
        int quo=mem/grp;
        int rem=mem%grp;
        System.out.printf("Total teams formed: %d %nPlayers left out: %d",quo,rem);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

//This program is that extract the sentence and define position,  then print that portion
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
       String a;
       int j,k;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your string");
       a = in.nextLine();
       System.out.println("Enter your position");
       j = in.nextInt();
       System.out.println("Enter your second position");
       k = in.nextInt();
       System.out.println(a.substring(j,k));
    }
    
}
/*
	Author: Chin Wattanapoka
	Rollno: 1315918
	Date: 20/11/2014
*/
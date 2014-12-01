//To count the word of sentence
import java.util.Scanner;
public class stringword {
    public static void main(String[] args) {
       String a;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your Line");
       a = in.nextLine();
       int i = a.split(" ").length;   
       System.out.println(i);
    }
    
}
/*
	Author: Chin Wattanapoka
	Rollno: 1315918
	Date: 20/11/2014
*/
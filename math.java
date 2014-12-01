//Program For calculate plus,cube root,cosine, and maximum
import java.util.Scanner;
import java.lang.Math.*;
public class math
{
	public static void main(String args[])
	{
		double a,b,c,d;
		Scanner i =new Scanner(System.in);
		System.out.println("Enter two value");
		a=i.nextDouble();
		b=i.nextDouble();
		d=a+b;
		c=Math.abs(d);
		System.out.println("Absolute  : "+c);
		c=Math.sin(a+b);
		System.out.println("Cube root : "+c);	
		c=Math.cos(d);
		System.out.println("Cosine : "+c);
		c=Math.max(a,b);
		System.out.println("Maximum : "+c);
	}
}
/*
	Author: Chin Wattanapoka
	Rollno: 1315918
	Date: 20/11/2014
*/
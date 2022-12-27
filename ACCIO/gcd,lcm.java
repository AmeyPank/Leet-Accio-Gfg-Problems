import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		int on1 = n1;
		int on2 = n2;

		while(n1%n2 != 0){
			int rem = n1%n2;
			n1 = n2;
			n2 = rem;
			
		}
		int gcd = n2;
		int lcm = (on1*on2)/gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}
}
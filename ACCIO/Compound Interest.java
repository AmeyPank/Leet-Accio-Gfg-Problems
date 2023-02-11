import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextInt();
		double time = sc.nextInt();
		double rate = sc.nextInt();
  
        /* Calculate compound interest */
        double CI = principal *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound interest = "+ CI);
	}
}
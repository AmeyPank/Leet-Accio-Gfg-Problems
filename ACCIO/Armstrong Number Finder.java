import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int on = N ;
      int sum = 0;
      while (N>0)
        {
          int digit = N%10;
          sum += digit*digit*digit;
          N /= 10;
          
        }
      if(on==sum)
      {
        System.out.println(1);
      }else{
         System.out.println(0);
      }

	}
}
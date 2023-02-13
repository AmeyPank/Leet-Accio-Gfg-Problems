import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();
    for (int i=1;i<=n;i++)
    {
      for (int j=0;j<n-i;j++)
      {
        System.out.print(" ");
      }
       for (int j=0;j<i;j++)
       {
          System.out.print("#");  
       }
          System.out.println("");
    }  
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int on=N;
      int temp =0;
      while(N>0)
        {
          temp = temp*10+(N%10);
          N = N/10;
        }
      if(temp==on){
        System.out.println(true);
      }else
      {System.out.println(false);}
	}
}
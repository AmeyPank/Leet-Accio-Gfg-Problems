import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String args[])
  {
    // your code here
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt ();
    int n = sc.nextInt ();
    long ans = Solution.power (x, n);
    System.out.println (ans);
  }
}
class Solution
{
  static long power(int x, int n)
  {
	  if(n==0){
		  return 1;
	  }
	 long xnm = power(x, n-1);
	  long res = x* xnm;
	  return res;
  }
}
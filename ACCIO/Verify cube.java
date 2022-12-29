// Approach

// We calculate lhs as (a+b)(a+b)(a+b) and rhs as (aaa)+(bbb)+(3abb)+(3aab).

// We further check if they give the same value or different value, if they give the same value, we print VERIFIED else we print NOT VERIFIED.

// Code:

// Java
import java.util.*;

public class Main {

    public static void verifyCube(long a, long  b)
    {
        //Write your code here
      long lhs=(a+b)*(a+b)*(a+b);
      long rhs=(a*a*a)+(b*b*b)+(3*a*b*b)+(3*a*a*b);
      System.out.println(lhs);
      System.out.println(rhs);
      if(lhs==rhs)
      System.out.println("VERIFIED" );
	  else
      System.out.println("NOT VERIFIED" );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong();
        long b= sc.nextLong();
        verifyCube(a,b);
    }
}
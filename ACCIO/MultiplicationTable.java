import java.io.*;
import java.util.*;
class solution
{
    public static void solve(int n)
   {
        //write your code here
	   for(int i = 1;i<=10;i++){
		  
			System.out.println(n*i);		   
	   }
   }
}
public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);        
	    int n=s.nextInt();
        solution.solve(n);
	}
}
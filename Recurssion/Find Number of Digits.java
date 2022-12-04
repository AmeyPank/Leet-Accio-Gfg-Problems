import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n= 0, c= 0;
                n = sc.nextInt();
                c = count(n);

                System.out.println(c);
	}

        static int count(int n){
                if(n<10){
                        return 1;

                }
                return  1+count(n/10);
        }
}
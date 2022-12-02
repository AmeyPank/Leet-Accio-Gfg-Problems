import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                System.out.println(noX(s));
	}
        public static String noX(String s)
        {
                if(s.equals(""))
                {
                        return s;
                }
                if(s.charAt(0)=='x')
                {
                        return noX(s.substring(1));
                }else
                {
                        return s.charAt(0)+noX(s.substring(1));
                }
        }
}
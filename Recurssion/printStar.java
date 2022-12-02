import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
		String str =sc.next();
		System.out.println(pairStar(str));
	}
	public static String pairStar(String str) 
	{
                if (str.length()<2)
                {
                        return str;
                }

                String result = str.substring(0,1);
                if (str.charAt(0) == str.charAt(1))
                {
                        result += "*";
                }

                return result + pairStar(str.substring(1));
    }
}
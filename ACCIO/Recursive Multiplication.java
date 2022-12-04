import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner s = new Scanner (System.in);
                int x = s.nextInt();
                int y = s.nextInt();

                int ans = multiply(x, y);
                System.out.println(ans);
	}
        static int multiply(int x, int y){
                if(x==0 || y== 0){
                        return 0;
                }else if(x==1){
                                return y;
                } else{
                                return multiply(x-1, y)+ y;
                }
        }                
}

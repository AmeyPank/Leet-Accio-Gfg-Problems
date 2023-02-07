import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner (System.in);
                int n1= sc.nextInt();
                int n2 = sc.nextInt();
                for(int i = n1;i<n2;i++){
                        int n = i;
                        int sum= 0;
                        int factor= 1;
                        while(factor<n){
                                if((n % factor)==0){
                                        sum = sum+factor;
                                }
                                factor++;
                        }
                        if(sum ==i){
                                System.out.print(" "+i);
                        }
                }
	}
}
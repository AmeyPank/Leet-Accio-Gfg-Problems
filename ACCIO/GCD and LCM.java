import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
		int num1 = input.nextInt();
	 
        int num2 = input.nextInt();
        
        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
    
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}
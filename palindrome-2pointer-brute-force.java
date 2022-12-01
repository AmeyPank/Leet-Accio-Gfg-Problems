// Approach 1: Brute force

// just extract all the digits of the number and check the ith digit with (n-i)th digit where n is the number of digits.

// Time Complexity: O(number of digits)

// Space Complexity: O(1)

// Below is the Java implementation of above idea:

// Java
import java.util.*;

class Accio{ 
    static boolean PalindromeNumber(int N){ 
        String s = String.valueOf(N); 
        int l = 0, r = s.length() - 1; 
        boolean ok = true; while(l < r){ 
            if(s.charAt(l) != s.charAt(r)){ 
                return false; 
            } 
            l++;r--; 
        } 
        return true; 
    } 
}


public class Main { 
    public static void main(String[] args) throws Throwable { 
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        Accio obj = new Accio(); 
        boolean ans = obj.PalindromeNumber(N); 
        if(ans) System.out.println("true"); 
        else System.out.println("false"); 
    } 
}
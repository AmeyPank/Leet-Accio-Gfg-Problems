// Approach:
// The idea is simple, we generate all terms from 1 to n. First, two terms are initialized as "1" and "11", and all other terms are generated using previous terms.
// To generate a term using the previous term, we scan the previous term.
// While scanning a term, we simply keep track of the count of all consecutive characters. For a sequence of the same characters, we append the count followed by the character to generate the next term.
// Time Complexity:

// O(2^n).

// Space Complexity:

// O(2^(n-1))

// Below is the implementation of the above idea:

// 1. Java

import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        
        Solution ob = new Solution();
        
        System.out.println(ob.countandsay(n));
    } 
} 
class Solution
{
    public String countandsay(int n) {
        if (n == 1)
            return "1";
        if (n == 2)
            return "11";
    
        String result = countandsay(n-1);
        
        String newresult = "";
        int count = 1;
        for(int i = 1; i < result.length(); ++i){
            
            if(result.charAt(i)!=result.charAt(i-1)){
                newresult+=(char)('0'+count);
                newresult+=(char)(result.charAt(i-1));
                count = 1;
            }
            else
                count++;

            if(i == result.length()-1){
                newresult+=(char)('0'+count);
                newresult+=(char)(result.charAt(i));
            }
        }
        return newresult;
    }   
}

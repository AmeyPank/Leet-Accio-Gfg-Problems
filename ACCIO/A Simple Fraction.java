import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            String[] S = br.readLine().trim().split(" ");
            int numerator = Integer.parseInt(S[0]);
            int denominator = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            String ans = ob.fractionToDecimal(numerator, denominator);
            System.out.println(ans);
        
    }
}

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // edge cases
        if (numerator == 0) return "0";
        if (denominator == 0) return "";
        
        StringBuilder result = new StringBuilder();
        
        // determine sign
        if (numerator < 0 ^ denominator < 0) {
            result.append("-");
        }
        
        // convert to long to avoid overflow
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        
        // quotient
        long quotient = num / den;
        result.append(quotient);
        
        // remainder
        long remainder = num % den;
        if (remainder == 0) {
            return result.toString();
        }
        
        // fractional part
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }
        
        return result.toString();
    }
}

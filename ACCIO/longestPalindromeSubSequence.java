// Approach 1
// We will use Dynamic programming to solve this problem .

// Algorithm:

// LCS of s and reverse of the string s will give the length of the longest palindromic subsequence of a.
// so we cann LCS(s,reverse(s))
// Time Complexity:

// O(n^2) ,Where n is the length of the string s.

// Space Complexity:

// O(n^2), Where n is the length of the string s.

// Below is the implementation of the above idea:

// 1. Java


import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    public static int longestPalindromeSubseq(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        
        return lcs(s , rev);
    }
    
    private static int lcs(String s , String t)
    {
        int a = s.length();
        int b = t.length();
        
        int[][] dp = new int[a+1][b+1];
        
        for(int i=0; i<a+1;i++)
            dp[i][0] = 0;
        
        for(int i=0; i<b+1;i++)
            dp[0][i] = 0;
        
        for(int i=1; i<a+1;i++)
        {
            for(int j=1; j<b+1;j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                
                else
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
            }
        }
        
        return dp[a][b];
    }
}
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(Solution.longestPalindromeSubseq(s));

	}
}

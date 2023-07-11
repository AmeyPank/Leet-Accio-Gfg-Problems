/*
Convert To Palindrome
Given a string S consisting only of lowercase characters. We need to check whether it is possible to make this string a palindrome after removing exactly one character from this.

If it is possible then print 1 else return 0.

Input Format
The first line given is the string S.

Output Format
Print 1 if it is possible to convert S to palindrome by removing exactly one character else return 0.

Example 1
Input

abcba
Output

1
Explanation

We can remove character 'c' to make string palindrome.

Example 2
Input

abecbea
Output

 0
Explanation

It is not possible to make this string palindrome just by removing one character*/ import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static int solve(String A) {
        int left = 0;
        int right = A.length() - 1;

        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                // If the characters don't match, check if removing either character
                // at the current positions will make the remaining string a palindrome.
                return isPalindrome(A, left + 1, right) || isPalindrome(A, left, right - 1) ? 1 : 0;
            }
            left++;
            right--;
        }

        // The string is already a palindrome.
        return 1;
    }

    private static boolean isPalindrome(String A, int left, int right) {
        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
public class Main{
          public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
	    String A = sc.nextLine();
            Solution Obj = new Solution();
            int ans=Obj.solve(A);
            System.out.println(ans);
	}
}
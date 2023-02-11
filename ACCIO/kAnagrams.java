// Approach:
// Stores occurrence of all characters of both strings in separate count arrays. Count number of different characters in both strings (in this if a string has 4 a and second has 3 'a' then it will be also counted. If count of different characters is less than or equal to k, then return true else false.

// Algorithm:

// Stores occurrence of all characters of both strings in separate count arrays.
// Count number of different characters in both strings (in this if a string has 4 a and second has 3 'a' then it will be also counted.
// If count of different characters is less than or equal to k, then return true else false.

// Time Complexity

// O(n)

// Space Complexity

// O(n)

// Below is the implementation of the above idea:

// 1. Java


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String s1 = input.next(), s2 = input.next();
        if(s1.length() != s2.length()){
            System.out.println(0);
            return;
        }
        int n = s1.length();
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i = 0; i < n; i++){
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(f1[i] > f2[i]){
                k -= (f1[i] - f2[i]);
            }
        }
        System.out.println(k >= 0 ? 1 : 0);
    }
}
/*Valid Arrangement of Pairs
You are given a 2D integer array pairs where pairs[i] = [begini, endi]. An arrangement of pairs is valid if endi == begini+1, for all i ∈ [0, pairs.length).

Return any valid arrangement of pairs.

Input Format
First line contains an integer n, which is the number of pairs

Next n lines contain two space-separated integers, the first one is begin and the second one is end for that respective pair.

Output Format
Complete the function ValidArrangement() which returns the required vector/array. The driver code will output the String Returned arrangement is Valid or Returned arrangement is not Valid depending on the internal judge.

Example 1
Input

4
4 1
3 4
2 3
1 2
Output

Returned arrangement is Valid*/ 

import java.util.*;

class Solution {

    public int[][] ValidArrangement(int[][] pairs) {
        // Write your code here
               int n = pairs.length;
        int[][] arrangement = new int[n][2];
        
        // Sort the pairs based on the ending element
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        
        // Build the valid arrangement
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                // The first pair remains as is
                arrangement[i] = pairs[i];
            } else {
                // Adjust the beginning element to match the ending element of the previous pair
                arrangement[i][0] = arrangement[i - 1][1];
                arrangement[i][1] = pairs[i][1];
            }
        }
        
        return arrangement; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[n][2];
        for(int i = 0; i < n; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
        }
    	Solution Obj = new Solution();
        int[][] ans = Obj.ValidArrangement(p);

        if(checker(ans))
            System.out.println("Returned arrangement is Valid");
        else
            System.out.println("Returned arrangement is not Valid");
    }

    public static boolean checker(int[][] p) {
        for(int i = 0; i < p.length-1; i++) {
            if(p[i][1] != p[i+1][0])
                return false;
        }
        return true;
    }
}
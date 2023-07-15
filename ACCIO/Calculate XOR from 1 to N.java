/*Calculate XOR from 1 to N
Given a number N, find the XOR of 1 to N.

Input Format
A integer N.

Output Format
Print the XOR of 1 to N.

Example 1
Input

5
Output

1
Explanation

000^001^010^011100^101= 001=1
Example 2
Input

6
Output

7
Explanation

000^001^010^011100^101^110=7

Constraints
1 <= N <= 2000*/ 

import java.util.*;

class Solution {
    public  static int computeXOR(int N)
    {
       //Write your code here
		// Calculate XOR based on the divisibility of N by 4
        if (N % 4 == 0) {
            return N;
        } else if (N % 4 == 1) {
            return 1;
        } else if (N % 4 == 2) {
            return N + 1;
        } else {
            return 0;
        }
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution.computeXOR(n));
    }
}


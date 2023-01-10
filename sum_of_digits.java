// We will use recursion.

// Algorithm:

// Form the sum by using recursion.
// Base is if n == 0, return 0;
// Call recursion by (n % 10 + sum_of_digit(n / 10))
// Below is the implementation of above idea:

// 1. Java:

import java.util.*;
import java.lang.*;

class Solution{
public static int sum_of_digit(int n)
{
    if (n == 0)
    return 0;
    return (n % 10 + sum_of_digit(n / 10));
}
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Ob = new Solution();
        System.out.println(Ob.sum_of_digit(n));
    }
}
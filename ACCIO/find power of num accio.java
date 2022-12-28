Approach 1
A simple solution to calculate pow(x, n) would multiply x exactly n times. We can do that by using a simple for loop.

Time Complexity

O(n) as we are multiplying it n times.

Space Complexity

O(1) as constant space is required.

Below is the implementation of algorithm:

1. Java

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long ans = Solution.Pow(x,n);
        System.out.println(ans);
    }
}

class Solution {

    static long Pow(int X, int N) {

// Base Case X ^ 0 = 1.
        if (N == 0)
            return 1;

// 0 ^ N = 0.
        if (X == 0)
            return 0;

// N is even.
        if (N % 2 == 0) {

            // X ^ N = (X ^ (N / 2)) * (X ^ (N / 2)).
            return (Pow(X, N / 2) * Pow(X, N / 2));
        }

// N is odd.
        else {

            // X ^ N = (X * X ^ (N / 2)) * (X ^ (N / 2)).
            return (X * Pow(X, N / 2) * Pow(X, N / 2));
        }
    }
}
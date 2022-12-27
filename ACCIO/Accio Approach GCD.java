// Approach:
// We can use Euclid's GCD algorithm which is as follows: a = q0b + r0 b = q1r0+r1 r0 = q2*r1+r2 . We do this until it becomes 0. Then that divisor is the GCD for all the pairs of numbers till GCD(a,b).

// Algorithm:

// Pass the parameters a and b to the GCD function.
// Pass b as a and remainder a%b as b.
// Return a when b==0.
// Time Complexity:

// O(logb(a))

// Space Complexity:

// O(logb(a))

// Implementation of above idea:

// 1. Java

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = findGCD(a, b);
        System.out.println(ans);
    }

	static int findGCD(int a, int b){
        if(b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
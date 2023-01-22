// Approach :
// The idea is to traverse the number and if at each step, the last digit is 7,

// then add 1 to the ans and call the recursive function for the rest of the number.

// Algorithm:

// if (n % 10 == 7) return 1 + func7(n / 10)
// else return func7(n / 10);
// Also, the base case would be if n equals 0, the result is 0.

// Time Complexity:

// O(no. of digits in n)

// Space Complexity:

// O(1)

// Below is the implementation of the above approach:

// 1. Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
        sc.close();
    }

    public static int count7(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 7)
            return 1 + count7(n / 10);
        return count7(n / 10);
    }
}
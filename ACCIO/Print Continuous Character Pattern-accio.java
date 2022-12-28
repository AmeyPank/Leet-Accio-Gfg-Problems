// Approach 1:
// For each row print the characters for that row and increment the count of character.

// Algorithm:

// Make a character variable ch that denotes the starting value for each row.
// Iterate over all the rows from 1-n.
// For each row use a temporary character variable and print the corresponding character values for that row.
// If this temporary variable reaches 'Z' then reset it to 'A'. (Modulo technique can also be used to reset)
// Increment the ch value by 1 after printing each row.

// Time Complexity

// O(nn) we loop for 1+2+....+n iterations for each row this is equal to n(n+1)/2.

// Space Complexity

// O(1) constant space used.

// Below is the implementation of the above idea:

// 1. Java

import java.util.*;

public class Main {
    public static void printPattern2(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            char printChar = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print(printChar);
                if (printChar == 'Z')
                    printChar = 'A';
                else {
                    printChar = (char) ((int) (printChar + 1));
                }
            }
            System.out.println();
            ch = (char) (ch + 1);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printPattern2(n);
        sc.close();
    }
}
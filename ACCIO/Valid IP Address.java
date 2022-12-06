// Approach 1: Brute Force

// We can place the three dots at n possible positions, so brute force all possible combinations and test if the numbers created by those dots are between 0 and 255.

// Time Complexity: O(N^3).

// Space Complexity: O(N).

// Approach 2: Recursion

// We can use a recursive function that tracks the count of previous dots and current index. Our base case would be checking if i == n-1 and level == 5. Our transition would be all positions j from i such that the number created between i and j is between 0 and 255.

// Time Complexity: O(N^2).

// Space Complexity: O(N).

// Below is the implementation of above idea:

// Java:
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.printValidIPAddresses(str, 0, "", 0);
    }
}
class Solution {
    public static void printValidIPAddresses(String str, int index, String result, int count) {
        if (count == 4) {
            if (index == str.length()) {
                System.out.println(result);
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (index + i > str.length()) {
                break;
            }
            String s = str.substring(index, index + i);
            if (s.startsWith("0") && s.length() > 1 || (i == 3 && Integer.parseInt(s) >= 256)) {
                continue;
            }
            printValidIPAddresses(str, index + i, result + s + (count == 3 ? "" : "."), count + 1);
        }
    }
}
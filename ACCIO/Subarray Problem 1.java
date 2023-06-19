/*Subarray Problem 1
Given an array arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} of size 10. Find whether there exists a sub-array of size n and sum s, where n and s both are user input values.

Print YES if there exists a subarray of size n and sum s in the array arr else print NO

Input Format
The first and only line of input contains n and s

Output Format
Print either “YES” or “NO”

Example 1
Input

3 6
Output

YES
Explanation

The sum of elements at indices 0, 1,2 add upto 6

Example 2
Input

4 10
Output

YES
Explanation

The sum of elements at indices 0, 1, 2, 3 add upto 10*/ 
import java.util.*;

public class Main {

    public static void solve(int[] arr, int n, int s) {
        int start = 0;
        int end = 0;
        int currSum = arr[0];

        while (end < arr.length) {
            if (currSum == s && end - start + 1 == n) {
                System.out.println("YES");
                return;
            }
            if (currSum < s || end - start + 1 < n) {
                end++;
                if (end < arr.length) {
                    currSum += arr[end];
                }
            } else {
                currSum -= arr[start];
                start++;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = sc.nextInt();
        int s = sc.nextInt();
        solve(arr, n, s);
    }
}


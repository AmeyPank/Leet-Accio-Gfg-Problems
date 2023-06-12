/*
 * Given an array with N elements, the task is to rotate the array to the left by K steps, where K is non-negative.

Input Format
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to be rotated in the left direction.

Output Format
The only line of the output prints N space-separated integers representing the Rotated array elements.

Example 1
Input

8
7 5 2 11 2 43 1 1
2
Output

2 11 2 43 1 1 7 5
Explanation

Rotate 1 steps to the left: 5 2 11 2 43 1 1 7

Rotate 2 steps to the left: 2 11 2 43 1 1 7 5

Example 2
Input

8
7 5 2 11 2 43 1 1
3
Output

11 2 43 1 1 7 5 2
Explanation

Rotate 1 steps to the left: 5 2 11 2 43 1 1 7

Rotate 2 steps to the left: 2 11 2 43 1 1 7 5

Rotate 3 steps to the left: 211 2 43 1 1 7 5 2
*/

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int arr[], int n, int k) {
        // Create a temporary array to store the rotated elements
        int[] temp = new int[k];

        // Store the first K elements in the temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left by K positions
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy the elements from the temporary array to the end of the original array
        for (int i = n - k, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }
}

/*Row with Maximum 1's
You have been given a non-empty grid MAT with N rows and M columns consisting of only 0s and 1s. All the rows are sorted in ascending order.

Your task is to find the index of the row that has the maximum number of ones.

Note: If two rows have the same number of ones, consider the one with a smaller index.

Input Format
The first input line contains two space separated integers N and M representing the number of rows and columns of the grid, respectively.

From the second line, the next N lines represent the rows of the grid. Every row contains M single space-separated integers.

Output Format
Print the index of the row with the maximum number of ones.

Example 1
Input

2 2
1 1
1 1
Output:

0*/ 

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.rowWithMaximumOnes(arr,n,m));
        
    }
}

class Solution {
    static int rowWithMaximumOnes(int arr[][], int n, int m) {
        int maxOnesRow = -1;  // Variable to store the index of the row with maximum ones
        int maxOnesCount = 0; // Variable to store the count of maximum ones found so far

        // Traverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;       // Left boundary for binary search
            int right = m - 1;  // Right boundary for binary search
            int onesCount = 0;  // Count of ones in the current row

            // Binary search for the first occurrence of 1 in the row
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[i][mid] == 1) {
                    // Found a 1, update the count and move left to search for more 1s
                    onesCount = m - mid;
                    right = mid - 1;
                } else {
                    // Move right to continue the binary search
                    left = mid + 1;
                }
            }

            // Check if the current row has more ones than the maximum found so far
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }

        return maxOnesRow;
    }
}

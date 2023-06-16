/*
Longest Bitonic subsequence
Given an array A of N integers, find the length of longest possible bitonic subsequence.

It means the elements of the subsequence should be first in strictly increasing order, then strictly decreasing order.

Note Complete the given function. The input and output would be handled by the driver code.

Input Format
The first line contains an integer N.

The next line contains N space-separated integers.

Output Format
Print the answer in a new line.

Example 1
Input

7
0 2 8 106 100 9 108
Output

6*/ 

import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; ++i){
            array[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.println(ob.bitonicSequence(n,array));
    } 
} 

class Solution {
    static int bitonicSequence(int n, int arr[]) {
        int[] increasing = new int[n];
        int[] decreasing = new int[n];

        // Fill the increasing array
        for (int i = 0; i < n; i++) {
            increasing[i] = 1;  // Initialize each element as 1

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && increasing[j] + 1 > increasing[i]) {
                    increasing[i] = increasing[j] + 1;
                }
            }
        }

        // Fill the decreasing array
        for (int i = n - 1; i >= 0; i--) {
            decreasing[i] = 1;  // Initialize each element as 1

            for (int j = n - 1; j > i; j--) {
                if (arr[i] > arr[j] && decreasing[j] + 1 > decreasing[i]) {
                    decreasing[i] = decreasing[j] + 1;
                }
            }
        }

        // Find the maximum length of bitonic subsequence
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int length = increasing[i] + decreasing[i] - 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}

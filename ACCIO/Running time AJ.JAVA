// Approach 1:
// Count the number of inversions in insertion sort

// The first approach is to count the number of inversions in the array.
// The idea is to use the same approach as insertion sort. We traverse the array from left to right.
// For every element, we count the number of elements which are on the left side and are greater than it.
// Time Complexity:

// O(n^2)

// Space Complexity:

// O(1)

// Below is the implementation of the above approach:

// 1. Java

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.countNumberOfInsertionSortInversions(arr));
    }
}

class Solution {
    static int countNumberOfInsertionSortInversions(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
                count++;
            }
        }
        return count;
    }
}
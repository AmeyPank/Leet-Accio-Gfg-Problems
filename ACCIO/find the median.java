// Approach
// We will follow the brute force approach The algorithm can be summarized as follows -

// Sort the array
// Print the middle element i.e. n/2 th element where n is the size of array
// Time Complexity:

// O(nlogn), since we are sorting array

// Space Complexity:

// O(1), because we sorting the given array so no additional space required

// Below is the implementation of the above idea:

// 1. Java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[n / 2]);
    }
}
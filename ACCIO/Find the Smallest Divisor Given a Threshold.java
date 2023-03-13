
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int threshold = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.smallestDivisor(arr, threshold));
        sc.close();
    }
}

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //write code here
		        int left = 1; // the smallest possible divisor is 1
        int right = Integer.MAX_VALUE; // the largest possible divisor is the maximum integer value
        while (left < right) {
            int mid = left + (right - left) / 2; // calculate the mid point of the current range
            if (check(nums, mid, threshold)) { // if the sum of division of nums by mid is <= threshold
                right = mid; // set right to mid as the smallest divisor may exist in the left side
            } else {
                left = mid + 1; // set left to mid + 1 as the smallest divisor may exist in the right side
            }
        }
        return left;
    }

    // Helper method to check if the sum of division of nums by divisor is <= threshold
    public static boolean check(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num - 1) / divisor + 1; // add the ceiling of num/divisor to sum
        }
        return sum <= threshold;
    }
};
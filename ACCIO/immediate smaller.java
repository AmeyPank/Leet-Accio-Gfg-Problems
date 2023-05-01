/*Immediate Smaller Element
Given an integer array arr of size n. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller. If next element is smaller, update the current index to that element. If not, then -1.

Input Format
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output Format
Print an array of integers denoting the immediate smaller element after the current element.

Example 1
Input

4
4 2 1 3
Output

2 1 -1 -1
Explanation From left to right, at index 0, arr[1] < arr[0], hence arr[0] = arr[1]. at index 1, arr[2] < arr[1], hence arr[1] = arr[2]. at index 2, arr[3] >= arr[2], hence arr[2] = -1. at index 3, there is no element to its right hence the value of this array element is -1.

Constraints
1 <= n <= 104

1 <= arr[i] <= 106*/
import java.util.*;

class Solution {
    public void ImmediateSmaller(int[] arr, int n) {
        int[] result = new int[n];
        Arrays.fill(result, -1);
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                result[i] = arr[i + 1];
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        Solution Obj = new Solution();
        Obj.ImmediateSmaller(arr, n);
    }
}

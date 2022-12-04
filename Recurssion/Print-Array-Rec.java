//Approach 1:
//
//        We need to print all the elements of array using recursion, we do this by identifying the base case and subproblem.
//        Base Case: We are traversed all the elements, i == n
//        SubProblem: Print the current element and make a recursive call to print rest of the array.
//
//        Using these we make our Recursive solution, by printing the current element and making a recursive call for remaining elements,
//        if iterator reaches the end of array, we return.
//
//        Time Complexity: O(n), since we are basically doing array traversal of size n
//
//        Space Complexity: O(n), the size of function call stack is based on input size.
//
//        Below is the implementation of the above idea:
//
//        Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }

    public static void PrintArray(int[] arr, int n) {
        PrintArrayRecursive(arr, 0, n);
    }

    private static void PrintArrayRecursive(int[] arr, int i, int n) {
        if (i == n)
            return;
        System.out.print(arr[i] + " ");
        PrintArrayRecursive(arr, i + 1, n);
    }
}
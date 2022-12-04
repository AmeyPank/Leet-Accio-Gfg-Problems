//Approach 1:
//
//        We need to print all the elements of array in reverse order, using recursion, we do this by identifying the base case and
//        subproblem.Base Case: We are traversed all the elements, i == n
//        SubProblem: Print the current element and make a recursive call to print rest of the array.
//
//        Using these we make our Recursive solution, by making a recursive call for remaining elements first and then
//        printing the current element, if iterator reaches the end of array, we return.
//
//        Time Complexity: O(n),
//        since we are basically doing array traversal of size n
//
//        Space Complexity: O(n),
//        the size of function call stack is based on input size.
//
//        Below is the implementation of the above idea:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

    for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    PrintReverseArray(arr, n);
}

    public static void PrintReverseArray(int[] arr, int n) {
        PrintReverseArrayRecursive(arr, 0, n);
    }

    private static void PrintReverseArrayRecursive(int[] arr, int i, int n) {
        if(i == n)
            return;
        PrintReverseArrayRecursive(arr, i+1, n);
        System.out.print(arr[i] + " ");
    }
}
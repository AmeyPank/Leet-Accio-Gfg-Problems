// Approach 1
// The idea is to heapify the complete binary tree formed from the array in reverse level order following a top-down approach.
// First heapify, the last node in level order traversal of the tree, then heapify the second last node and so on.
// We do this recursively. By assuming the current node as the largest.
// Now if left child is larger than root assign left child to largest or if right child is larger than root assign right child to largest.
// At the end if the largest value has changed we swap it the root with the largest value and call heapify on the node.
// Time Complexity

// O(n)

// Space Complexity

// O(n)

// 1. Java

import java.util.*;

class Solution {
    void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    boolean checkHeap(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (arr[2 * i + 1] > arr[i]) {
                return false;
            }

            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    void buildHeap(int arr[]) {
        int n = arr.length;
        int startIdx = (n / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.buildHeap(arr);
        if (Obj.checkHeap(arr)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        sc.close();
    }
}
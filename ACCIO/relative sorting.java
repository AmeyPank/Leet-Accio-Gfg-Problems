// Approach 1:
// Use hashmap technique to do relative sorting. Store the frequency of arr1 and decrement the frequency in the arr2 order.

// Algorithm:

// Loop through arr1, store the count of every number in a HashMap (key: number, value: count of number)
// Loop through arr2, check if it is present in HashMap, if so, put in output array that many times and remove the number from HashMap.
// Sort the rest of the numbers present in HashMap and put in the output array.

// Time Complexity

// O(m+n), Traversing over both the array

// Space Complexity

// O(n), Space for storing frequency of arr1 of size n.

// Below is the implementation of the above idea:

// 1. Java

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
static void relativeSorting(int arr1[], int n, int arr2[], int m)
	{
        int ans[] = new int[n];
		HashMap<Integer, Integer> mp = new HashMap<>();

		int ind = 0;
		for (int i = 0; i < n; i++) {
			if (!mp.containsKey(arr1[i]))
				mp.put(arr1[i], 1);
			else
				mp.put(arr1[i], mp.get(arr1[i]) + 1);
		}

		for (int i = 0; i < m; i++) {

			if (mp.containsKey(arr2[i])) {
				for (int j = 1; j <= mp.get(arr2[i]); j++)
					ans[ind++] = arr2[i];
			}
			mp.remove(arr2[i]);
		}
		for (HashMap.Entry<Integer, Integer> it :
			mp.entrySet()) {
			for (int j = 1; j <= it.getValue(); j++)
				ans[ind++] = it.getKey();
		}
        for (int i = 0; i < n; i++)
			System.out.print(ans[i] + " ");
		System.out.println();
	}
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[]=new int[n] ;
        int arr2[]=new int[m] ;
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
           arr2[i]=sc.nextInt();
        }
    
        relativeSorting(arr1, n, arr2 , m);
}
}
// Approach 1:
// To be divisible by K we need to add such numbers either both numbers are divisible by K or the sum of modulo of the both numbers is divisible by K. For example x = Number%K and we need to find another number whose remainder is K-x. when we add these two numbers then the total sum is divisible by K. We will store the frequency of numbers using hashmap which gives the remainder from 0 to K-1. We will multiply the count of each value(x) with its complimentary value(K-x).

// Algorithm:

// Initialize a counter to store the result i.e count of pairs which are divisible by K.
// Initialize an empty Hashmap to store the frequency of numbers which gives the remainder from 0 to K-1.
// Traverse the array once and keep the frequency of each element in a map.
// Count for all i and (k-i) frequency pairs.
// Finally return the count of pairs that is stored in result counter.

// Time Complexity

// O(n),Traversing all the numbers to find their modulo value

// Space Complexity

// O(K),To store the frequency of remainders of all the numbers as the range of remainders lies between 0 to K-1.

// Below is the implementation of the above idea:

// 1. Java

import java.util.*;

class Solution{
	public static int countKdivPairs(int arr[],int N, int K){
		//Write code here and print
                int count = 0;
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int item: arr){
                    int rem = item % K;
                    if(rem != 0){
                        count += map.getOrDefault((K-rem), 0);
                    } else {
                        count += map.getOrDefault(0, 0);
                    }
                    map.put(rem, map.getOrDefault(rem, 0)+1);
                }
        return count;
    }
}

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
                int[] arr = new int[N];
		for(int i = 0 ; i < N; i++){
			arr[i] = scn.nextInt();
		}
		Solution Obj = new Solution();
                System.out.println(Obj.countKdivPairs(arr,N,K));
        }
}
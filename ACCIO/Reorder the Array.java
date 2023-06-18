/*Reorder the Array
You are given an array of integers. Vasya can permute (change order) its integers. He wants to do it so that as many as possible integers will come on a place where a smaller integer used to stand. Help Vasya find the maximal number of such integers.

For instance, if we are given an array [10,20,30,40], we can permute it so that it becomes [20,40,10,30]. Then on the first and the second positions the integers became larger (20>10, 40>20) and did not on the third and the fourth, so for this permutation, the number that Vasya wants to maximize equals 2.

Help Vasya to permute integers in such way that the number of positions in a new array, where integers are greater than in the original one, is maximal.

Input Format
The first line contains a single integer n — the length of the array.

The second line contains n integers a1,a2,…,an — the elements of the array.

Output Format
Return a single integer — the maximal number of the array''''s elements which after a permutation will stand on the position where a smaller element stood in the initial array.

Example 1
Input

7
10 1 1 1 5 5 3
Output

4
Explanation

One of the best permutations is [1,5,5,3,10,1,1] so the answer is 4.
Example 2
Input

5
1 1 1 1 1
Output

0
Explanation

There is no way to increase any element with a permutation, so the answer is 0.*/ 
import java.util.*;

class Solution {
    public int reorder(int[] a) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for (int count : countMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        int maxElements = a.length - maxCount;
        return maxElements;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.reorder(a));
        sc.close();
    }
}

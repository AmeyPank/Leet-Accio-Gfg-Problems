/*
We use two pointers start and end to represent starting and ending points of the sliding window. 
Initially both start and endpoint to the beginning of the array, i.e. index 0. 
Now, let’s try to add a new element. There are two possible conditions. 
1st case :

If sum is less than k, increment end by one position. So contiguous arrays this step produce are (end – start). 
We also add end to previous sum. There are as many such arrays as the length of the window.

2nd case :

If sum becomes greater than or equal to k, this means we need to subtract starting element from sum 
so that the sum again becomes less than k. So we adjust the window’s left border by incrementing start. 
We follow the same procedure until end < array size.
*/
import java.util.Scanner;

class Solution {
    public static int solve(int[] arr, int k) {
        int n = arr.length;

    int start = 0, end = 0;
    int count = 0, sum = arr[0];

    while (start < n && end < n) {

        if (sum < k) {
            end++;

            if (end >= start)
                count += end - start;

            if (end < n)
                sum += arr[end];
        }
        else {
            sum -= arr[start];
            start++;
        }
    }

    return count;
} }

public class Main { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] A = new int[n];
    for(int i=0;i<n;i++)
        A[i] = sc.nextInt();
    int B = sc.nextInt();
    Solution Obj= new Solution();
    System.out.println(Obj.solve(A, B));

}
}
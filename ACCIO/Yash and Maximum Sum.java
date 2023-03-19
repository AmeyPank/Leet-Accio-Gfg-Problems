import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Solution.kCornerElements(n,k,arr);
        System.out.println(ans);
    }
}
class Solution {
    static int kCornerElements(int N, int K, int [] arr) {
        // write code here
		    // check if the array is smaller than the value of K
    if (N <= K) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    int maxSum = 0;
    // loop through all possible values of k
    for (int i = 0; i <= K; i++) {
        // ignore i elements from the start and (K-i) elements from the end
        int start = i;
        int end = N - (K - i);
        int sum = 0;
        // calculate the sum of the remaining elements
        for (int j = start; j < end; j++) {
            sum += arr[j];
        }
        // update the maximum sum if the current sum is greater
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
    }

}

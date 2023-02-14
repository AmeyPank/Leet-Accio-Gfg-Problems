import java.util.*;

class Solution {
    public static long maxAlternatingSum(int[] nums) {
        //Write your code here
		 int n = nums.length;

        long dp[][] = new long[n+1][2];
        for(int i = 0;i<n;i++){
            dp[i+1][0] = Math.max(dp[i][0] , dp[i][1] - nums[i]);
            dp[i+1][1] = Math.max(dp[i][1] , dp[i][0] + nums[i]);
        }

        return dp[n][1];
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(Solution.maxAlternatingSum(input));
    }
}


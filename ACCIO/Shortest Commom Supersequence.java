import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		   String S=sc.next();
		   String T=sc.next();
		   System.out.println(new Solution().shortestCommonSupersequence(S, T));
		}
	}
}

class Solution
{
    public static int shortestCommonSupersequence(String S,String T)
    {
        // your code here
		int m = S.length(), n = T.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
    }
		return m + n - dp[m][n];
}
}
import java.util.*;

class Main {
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int p=sc.nextInt();             // Take size of both the strings as input
        int q=sc.nextInt();
        
        String a=sc.next();            // Take both the string as input
        String b=sc.next();
        
        Solution obj = new Solution();
        
        System.out.println(obj.lcs(p, q, a, b));

        sc.close();
    
    }
}


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int m, int n, String a, String b)
    {
        // your code here
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }
    return dp[m][n];
    }
    
}
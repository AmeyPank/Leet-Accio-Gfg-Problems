import java.util.*;

class Solution {
    public int recforMin(int[] arr, int n) {
        // your code here
            if(n==1){
                    return arr[0];
            }
            return Math.min(arr[n-1], recforMin(arr, n-1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        Solution solution = new Solution();
        System.out.println(solution.recforMin(arr, n));
    }
}
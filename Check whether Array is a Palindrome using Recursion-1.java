import java.util.*;

class Solution {

    public boolean isPalindrome(int[] arr, int n) {
        // your code here
		
    for(int i = 0; i< n ;i++) {
        int ans = 0;
        int temp = arr[i];

        while(temp > 0 ){
            int r = temp%10;
            temp/=10;

            ans = (ans*10)+r;

        }
        if(ans != arr[i]) {
            return false;
        }

    }
    return true;
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
        System.out.println(solution.isPalindrome(arr, n));
    }
}
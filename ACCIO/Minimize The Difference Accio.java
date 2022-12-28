import java.util.*;

class Solution {
    static int minimizeIt(int[] arr, int n, int k){
        // write code here
        if(n==1) return 0;
        Arrays.sort(arr);

        int diff = arr[n-1]-arr[0];
        int min, max;

        for(int i =1;i<n;i++){

            if(arr[i]-k<0) continue;

            max = Math.max(arr[i-1]+k, arr[n-1]-k);

            min = Math.min(arr[0]+k, arr[i]-k);

            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Solution.minimizeIt(arr, n,k);
        System.out.println(ans);
    }
}

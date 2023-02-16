import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        Solution ob = new Solution();
        
        System.out.println(ob.KthSmallest(m,n, k));
        
	}
}

class Solution {
    public int KthSmallest(int m, int n, int k) {
        int low = 1;
        int high = m * n;

        while(low<high){
            int mid = low + (high - low) / 2;

            int capacity  = count(mid, m , n);
            if(capacity >= k){
                high = mid;

            }
            else low = mid+1;
        }
        return low;
    }
     
     private int count(int mid, int m, int n){
         int count = 0;

         for(int i = 1; i<= m; i++){
             int temp = Math.min(mid / i, n);
             count += temp;
         }
         return count;
     }
}
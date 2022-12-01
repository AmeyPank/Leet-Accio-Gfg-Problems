import java.io.*;
import java.util.*;

class Solution { 
	
	public void TappingWater(int[] a, int n) { 
	
	//Write code here and print output

    long dp[] = new long[n];
    int max = 0;
	
    for(int i = 0; i < n; i++){
        max = Math.max(max, a[i]);
        dp[i] = max;
    }
    max = 0;
    long ans = 0;
    for(int i = n - 1; i >=0; i--){
		
        max = Math.max(max, a[i]);
        dp[i] = Math.min(dp[i], max);
    }
	
    for(int i = 0; i < n; i++){
        ans += dp[i] - a[i];
    }
	
    System.out.println(ans);
    
   
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n= sc.nextInt();
      	    int[] arr= new int[n];

      	    for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
        
            Solution Obj = new Solution();
            Obj.TappingWater(arr, n);
            
        
        sc.close();
        
    }
}
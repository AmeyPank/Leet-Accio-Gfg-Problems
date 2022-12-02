/*
Approach:

Sort the array and make an ans variable.
Start a for loop and inside the for loop take two variables l and r pointing toi+1 and i+2 respectively.
If the value of the rth index is smaller than the sum of the value of the lth and ith index then add the 
value to ans variable.
Increment r Else Increment l and if l>=r then increment r also.

Time Complexity: O(n^2)

Space Complexity: O(1)

Below is the implementation of the above approach:
*/
import java.util.*; 
import java.lang.*; 
import java.io.*;

public class Main { public static void main (String[] args) { 
    Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
		int[] A = new int[n];
    	for(int i=0;i<n;i++)
        A[i] = sc.nextInt();
        
    	Solution Obj= new Solution();
    	
        System.out.println(Obj.nTriang(A));
}
} 
class Solution{ 
    public static int nTriang(int[] arr) { 
        int n= arr.length; 
        Arrays.sort(arr); 
        long ans = 0, MOD = (long)(1e9 + 7); 
        for(int i=0; i<n-2; i++){ 
            int l = i+1, r = i+2; 
            
            while(l<n && r < n){ 
                
                if(arr[r] < arr[l] + arr[i]){ 
                    ans += (r - l); 
                    r++; ans %= MOD;
				}
				else{ 
                        l++;
					
				if(l>=r){ 
						r++;   
                    }   
                }   
            }     
        } 
        return (int)ans; 
        
    } 
    
}
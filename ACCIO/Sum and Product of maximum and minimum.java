import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            Solution ob = new Solution();
            long ans[] = ob.sumAndProduct(arr, n); 
            System.out.println(ans[0] + " " + ans[1]);           
        }
    }
}

class Solution{
    static long[] sumAndProduct(long arr[], long n){
        long min = arr[0];
        long max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long sum = max + min;
        long product = max * min;

        long[] result = {sum, product};
        return result;
    }
}

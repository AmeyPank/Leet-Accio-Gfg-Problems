import java.util.*;
class Solution
{
       static int xorSubarrayXors(int arr[], int n) {
        //Write code here
		   int result = 0;
		   for(int i =0;i<n;i++){
			   int subXOR = 0;
			   for(int j = i;j<n;j++){
				   subXOR ^=arr[j];
				   result ^= subXOR;
			   }
		   }
		   return result;
    }
}
public class Main {

    

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ans = Solution.xorSubarrayXors(arr, n);
        System.out.print(ans);
        input.close();
    }
}
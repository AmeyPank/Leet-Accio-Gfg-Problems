import java.util.*;

public class Main
{
    static int subarraySum(int[] arr, int k) {
	    //Write your code here
		int n = arr.length;
        int maxLen = 0;
        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum == k) {
                maxLen = i + 1;
            }
            if (map.containsKey(currSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(currSum - k));
            }
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }
        return maxLen;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n, k;
		    n=input.nextInt();
		    k=input.nextInt();
	        int arr[] = new int[n];
	        for(int j=0; j<n; j++)
	        {
	            arr[j] = input.nextInt();
	        }
	        System.out.println(subarraySum(arr,k));
		}
	}
}

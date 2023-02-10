// Approach 1
// We will use Sliding window Technique to solve this problem .

// Algorithm:

// Consider one window of size ‘K’ at a time.

// Take a variable ‘firstNegativeIndex’ to keep track of the index of the first negative element in each window of size ‘K’.

// After sliding the window one step ahead, we skip the elements which no longer fall under the current k size window as well as the positive elements.

// Time Complexity:

// O(N), where ‘N’ is the size of the array.

// There are a total of ‘N-K+1’ windows and we keep sliding the window one step ahead after encountering the first negative element. So overall time complexity will be O(N).

// Space Complexity:

// O(1).

// As we are not using an auxiliary space to store data. Hence, the Space complexity is O(1).

// Below is the implementation of the above idea:

// 1. Java

import java.util.*;
class Solution{
    public static int[] printFirstNegativeInteger(int arr[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int firstIndex = 0;
        int firstElement;

        // Traverse in all (n-k+1) windows.
        for (int i = k - 1; i < n; i++) {

            // Skip out of window and positive elements.
            while ((firstIndex < i) && (firstIndex <= i - k || arr[firstIndex] > 0)) {
                firstIndex++;
            }

            // Check if a negative element is found, otherwise use 0.
            if (arr[firstIndex] > 0) {
                firstElement = 0;
            } else {
                firstElement = arr[firstIndex];
            }

            ans.add(firstElement);
        }
        
        int res[] = new int[ans.size()];
        for(int r = 0 ; r < ans.size() ; r++){
            res[r] = ans.get(r);
        }
        return res;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int []ans = (Solution.printFirstNegativeInteger(arr, n , k ));
        for(int i = 0 ; i < ans.length ; ++i){
            System.out.print(ans[i] + " ");
        }
    }
}
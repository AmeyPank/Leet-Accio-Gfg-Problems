import java.io.*;
import java.util.*;
 

class Solution {
    static int solve(int N, int[] Arr, int K) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array and calculate the cumulative sum
        for (int i = 0; i < N; i++) {
            sum += Arr[i];

            // Check if there is a subarray with sum (sum - K) in the hashmap
            if (sum == K)
                count++;

            if (map.containsKey(sum - K))
                count += map.get(sum - K);

            // Add the current sum to the hashmap with its count
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_Arr = br.readLine().split(" ");
         int[] Arr = new int[N];
         for(int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++)
         {
         	Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
         }
         int K = Integer.parseInt(br.readLine().trim());
 
         int out_ =  Solution.solve(N, Arr, K);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}
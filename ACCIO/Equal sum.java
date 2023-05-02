import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int[] arr = new int[n];
        
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        Solution g = new Solution();
        boolean ans= g.splitArray(n, arr);
        System.out.println(ans);
  }
}

class Solution {
boolean splitArray(int n, int[] arr) {
int totalSum = 0;
for (int num : arr) {
totalSum += num;
}
if (totalSum % 2 != 0) {
return false;
}
int halfSum = totalSum / 2;
boolean[] possibleSums = new boolean[halfSum + 1];
possibleSums[0] = true;
for (int i = 0; i < n; i++) {
for (int j = halfSum; j >= arr[i]; j--) {
possibleSums[j] |= possibleSums[j - arr[i]];
}
}
return possibleSums[halfSum];
}
}
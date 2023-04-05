import java.util.*;

class Solution {
    public void zeroMax(int n, int[] arr) {
        // write code here

		int maxOdd = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 1 && arr[i] > maxOdd) {
                maxOdd = arr[i];
            }
            if (arr[i] == 0) {
                arr[i] = maxOdd;
            }
    }
}
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        Obj.zeroMax(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
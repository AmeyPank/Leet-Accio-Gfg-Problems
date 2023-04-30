import java.util.*;

class Solution {
    public static int[] runningSum(int[] arr) {
        int n = arr.length;
        int[] runningSum = new int[n];
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            runningSum[i] = currentSum;
        }
        return runningSum;
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int [] arr=(Solution.runningSum(input));

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}


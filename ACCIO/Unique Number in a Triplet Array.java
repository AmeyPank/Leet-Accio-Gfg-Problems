import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int singleNumber(int[] arr) {
    // Your code here
	int n = arr.length;
    int result = 0;
        for (int i = 0; i < 32; i++) { // 32 bit integer
            int sum = 0;
            int bit = (1 << i); // setting the bit position
            for (int j = 0; j < n; j++) {
                if ((arr[j] & bit) != 0) { // checking if the bit is set
                    sum++;
                }
            }
            if ((sum % 3) != 0) { // checking if the bit appears in the unique number
                result |= bit; // setting the bit in the result number
            }
        }
        return result;
}
}
public class Main {
  public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.singleNumber(nums));
	}
}
import java.io.*;
import java.util.*;

class Solution{
    static int specialSum(ArrayList<Integer> arr){
         //Write code here
		// calculate the sum of all elements
        int total_sum = 0;
        for(int i=0; i<arr.size(); i++){
            total_sum += arr.get(i);
        }
        
        // keep adding digits till a single digit is left
        while(total_sum > 9){
            int sum_digits = 0;
            while(total_sum > 0){
                sum_digits += total_sum % 10;
                total_sum /= 10;
            }
            total_sum = sum_digits;
        }
        return total_sum;
    }
        
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.specialSum(arr);
        System.out.println(ans);
	}
}
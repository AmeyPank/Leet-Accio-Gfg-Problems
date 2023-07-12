import java.util.*;
class Solution{
static double average(int a[], int n)
    {
      int sum = 0;
    // Your code here
		for(int i =0; i<n;i++){
			sum +=a[i];	
		}
		double average = (double) sum/n;
		return Math.round(average * 100.0) /100.0;
    }
	}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mat = new int[n];
		for (int i = 0; i < n; i++) {
			mat[i] = sc.nextInt();
		}
		double res = Solution.average(mat, n);
		System.out.format("%.2f", res);
	}
}
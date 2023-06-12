import java.util.*;

class Solution {

    static void solve(int N) {
        // Write your code here
		 int mid = N / 2;
        
        // Print upper half of the pattern
        for (int i = 1; i <= mid + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Print lower half of the pattern
        for (int i = mid; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.solve(n);
    }
}


import java.util.Scanner;

class Solution{
    public static int sumDigits(int n) {
    // Your code here
		if (n == 0) { // base case
            return 0;
        } else {
            return (n % 10) + sumDigits(n / 10); // recursive case
        }
}
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(Solution.sumDigits(n));
    }
}
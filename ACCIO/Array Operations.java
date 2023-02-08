import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int N) {
        // Write your code here
		 int sum=0, max=arr[0];

        for(int i = 0; i < N; i++) {
            sum+=arr[i];
            max=Math.max(max, arr[i]);
        }

        System.out.println(sum+" "+(sum/N)+" "+max);
    }
}
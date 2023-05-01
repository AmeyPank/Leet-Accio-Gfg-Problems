import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int sum1 = computeSum(a, b, n);

        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;

            int sum2 = computeSum(a, b, n);
            sum1 = Math.max(sum1, sum2);
        }

        System.out.println(sum1);
    }

    static int computeSum(int[] a, int[] b, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i]*b[i];
        }
        return sum;
    }
}

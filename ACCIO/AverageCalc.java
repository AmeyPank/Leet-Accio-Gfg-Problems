import java.util.*;

class Accio {
    public int calculateAvg(int[] arr, int n) {
        int sum = 0;

        // Calculate the sum of all elements in the array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate the average
        int average = sum / n;

        return average;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Accio Obj = new Accio();
        System.out.println(Obj.calculateAvg(arr, n));
    }
}

import java.util.*;

class Solution {
    public static int kthLargestSum(int arr[], int N, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += arr[j];
                
                pq.offer(sum);
                
                if (pq.size() > K) {
                    pq.poll();
                }
            }
        }
        
        return pq.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.kthLargestSum(arr, N, K));
    }
}

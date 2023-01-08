import java.util.*;

class Solution{
	public static int countKdivPairs(int arr[],int N, int K){
		//Write code here and print
                int count = 0;
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int item: arr){
                    int rem = item % K;
                    if(rem != 0){
                        count += map.getOrDefault((K-rem), 0);
                    } else {
                        count += map.getOrDefault(0, 0);
                    }
                    map.put(rem, map.getOrDefault(rem, 0)+1);
                }
        return count;
    }
}

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
                int[] arr = new int[N];
		for(int i = 0 ; i < N; i++){
			arr[i] = scn.nextInt();
		}
		Solution Obj = new Solution();
                System.out.println(Obj.countKdivPairs(arr,N,K));
        }
}
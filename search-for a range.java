import java.io.*;
import java.util.*;

public class Main {
        static int firstOccurance(int arr[], int target){
        int ans = -1;
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(arr[mid] > target){
                r = mid - 1;
            }
            if(arr[mid] < target)
                l = mid + 1;
            if(arr[mid] == target){
                ans = mid;
                // to look for occurance of target left 
                // to the current occurance (if any)
                r = mid - 1;
            }
        }
        return ans;
    }
    static int lastOccurance(int arr[], int target){
        int ans = -1;
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(arr[mid] > target){
                r = mid - 1;
            }
            if(arr[mid] < target)
                l = mid + 1;
            if(arr[mid] == target){
                ans = mid;
                // to look for occurance of target right
                // to the current occurance (if any)
                l = mid + 1;
            }
        }
        return ans;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                }
                int target = sc.nextInt();
                System.out.print(firstOccurance(arr, target) + " ");
                System.out.print(lastOccurance(arr, target) + " ");
	}
}
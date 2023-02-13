import java.util.*;
class Solution {
    public int[] findClosestElements(int[] arr, int k, int x) {
       int left = 0;
       int right = arr.length - k;

       while(left < right){
           int mid = (left + right) / 2;

           if(x - arr[mid] > arr[mid + k] - x){
               left = mid + 1;

           }else{
               right = mid;
           }
       }
		int[] result = new int[k];

       for(int i = left; i < left + k; i++){
           result[i-left]=arr[i];
       }
       return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution Obj = new Solution();
        int [] ans = Obj.findClosestElements(nums,k,x);
        for (int an : ans) System.out.print(an + " ");
    }
}

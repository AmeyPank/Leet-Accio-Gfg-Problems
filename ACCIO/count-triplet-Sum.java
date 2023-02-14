import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++) {
            A[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = Solution.threeSumSmaller(n,A,target);
        System.out.println(ans);
    }
}
class Solution {
    static int threeSumSmaller(int n, int[] arr, int target) {
        // write code here
		 Arrays.sort(arr);
        int c = 0;
        
        for(int i = 0;i<arr.length-2;i++){
            int start = i+1;
            int end = arr.length -1;
            
            while(start<end){
                long t = arr[i] + arr[start] + arr[end];
                
                if(t< target){
                    c =  c + end -start;
                    start++;
                }else{
                    end--;
                }
            }
        }
        return c;
    }
}
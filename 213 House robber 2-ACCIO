import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public int HouseRobber(int[] nums) {
        int n = nums.length;
        
        int dp[]= new int[n-1];
        
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0], nums[1]);
            
        }
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        
        //0th index - n-2 index
        for(int i = 2;i<n-1;i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        //1st inde- n-2 index
        int[] dp1 = new int[n];
        
        dp1[1]= nums[1];
        dp1[2]= Math.max(nums[1], nums[2]);
        for(int i = 3; i<n;i++){
            dp1[i]= Math.max(dp1[i-2]+nums[i],dp1[i-1]);
        }
        return Math.max(dp[dp.length-1], dp1[dp1.length-1]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.HouseRobber(arr));

    }
}
//Approach 1:
//
//        The problem requests you to find the maximum sum that you can obtain with elements that will be selected where
//        they are not next to each other. The thing to notice here is that we have two separate cases:
//
//        We rob the first house but leave the last house
//        Skip the first house and rob the last house
//        At each house, we can calculate the profit of stealing from this house and leaving the neighboring house,
//        and the profit from leaving this current house in order to rob from neighboring adjacent houses. Finally,
//        return the maximum profit in the above cases. Since at each step, we have multiple choices, we can use recursion
//        here.
//
//        Time Complexity: O(2^n)
//
//        Space Complexity: O(n)
//
//        Below is the implementation of the above idea:
//
import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public int helper(int[] nums, int start, int n){
        if(n < start)return 0;
        if(n == start)return nums[start];
        return Math.max(helper(nums,start,n-1),helper(nums,start,n-2) + nums[n]);
    }
    public int HouseRobber(int[] nums) {
        // Write your code here
        if(nums.length == 1)return nums[0];

        int one = helper(nums,0,nums.length-2);

        int two = helper(nums,1,nums.length-1);
        return Math.max(one,two);
    }
}

    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Accio Obj = new Accio();
        System.out.println(Obj.HouseRobber(arr));
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int nums[] = new int[index];

        for (int i = 0; i < index; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = array11(nums, 0);
        System.out.println(ans);
    }

    public static int array11(int nums[], int index)
    {
        if(index == nums.length){
            return 0;
        }
        else{
            if(nums[index]==11) {
                return 1 + array11(nums, index + 1);
            }
            else {
                return array11(nums, index + 1);
            }
        }
    }
}
    // {
    //  if (index == nums.length) {
    //         return 0;
    //     }
    //     int c = 0;
    //     if (nums[index] == 11) {
    //         c++;
    //     }
    //     return c + array11(nums, index + 1);
    // }
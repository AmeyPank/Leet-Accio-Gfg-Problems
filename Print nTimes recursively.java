/*
Approach: It is similar to printing numbers from N to 1 using recursion, but instead of printing numbers, 
we print the required word in each recursive function. In each recursive call, we print the word once, 
and call the same function again with N-1 as it's argument and trust that the function will print N-1 times,
 combined with our 1 print, it will be N. Similarly for N-1, it would pass N-2 as argument and print it once. 
This will continue till N becomes 0.
 Then we can stop printing. In the meantime, we would have printed N-1 times.

Algorithm:

Declare a function that takes single argument N, => func(N).
If (N<=0) we can stop printing and simply return.
else, we print the word "AccioSchool", and call the function recusively with argument as N-1. => func(N-1).

Time Complexity: O(N). 
Space Complexity: O(N) because of recursion stack.*/

import java.util.*;

class Solution {
    static int printword(int n) {
        //Write your code here
//        static void printword(int N) {
//            //Write your code here
//            if(N<=0){
//                return;
//            }
//            System.out.println("AccioSchool") ;
//            printword(N-1);//recursive call
//        }

        if (n <=0) {
            return -1;
        } else {
            String str = "AccioSchool";
            System.out.println(str);
        }

        return printword(n-1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printword(n);
    }
}


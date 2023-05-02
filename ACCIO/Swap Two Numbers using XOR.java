import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    static List<Integer> get(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return Arrays.asList(a, b);
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution ob = new Solution();
        List<Integer> ans = ob.get(a,b);
        System.out.println(ans.get(0)+" "+ans.get(1));
    }
}
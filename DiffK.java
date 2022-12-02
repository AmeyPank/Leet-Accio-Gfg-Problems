import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int diffPossible(int[] A, int tar) {
        int n = A.length;

        int i = 0;
        int j = 1;

        while(i<n && j<n){

            int diff = A[j] - A[i];
            if(diff < tar){
                j++;
            }
            else if(diff > tar ){
                i++;
            }
            else{
                if(i != j){
                    return 1;
                }else{
                    j++;
                }

            }
        }
        return 0;
        //Write your code here
    }
}
public class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i] = sc.nextInt();
        int k= sc.nextInt();
        Solution Obj= new Solution();
        System.out.println(Obj.diffPossible(A, k));
    }
}
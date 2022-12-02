import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int A[] = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = s.nextInt();
        }
        
        int B[] = reverseArray(A,0,A.length-1);
        
        for(int i:B){
            System.out.print(i+" ");
        }
    }

    static int[] reverseArray(int[] a,int i,int j)
    {
        //check if 1st index is less than last index
        if(i<j)
        {
            //swap elements a[i],a[j]
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            // reverse the array by calling the reverseArray() method recursively.
            reverseArray(a, i+1, j-1);
        }
        return a;
    }
}
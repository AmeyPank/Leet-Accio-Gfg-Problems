import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        
        int arr[] = new int [N];
        
        for(int i = 0 ; i<N; i++){
         arr[i]= sc.nextInt();
     }
        System.out.println(findSum(arr, arr.length));
	}
 
    // Return sum of elements in A[0..N-1]
    // using recursion.
    static int findSum(int A[], int N)
    {
        if (N <= 0)
            return 0;
        return (findSum(A, N - 1) + A[N - 1]);
    }
}
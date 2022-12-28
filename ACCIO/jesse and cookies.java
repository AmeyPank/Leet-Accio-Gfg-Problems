import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];
                int count = -1;
                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                int i = 0;
                Arrays.sort(arr);
                while(arr[i]<k && (i+1)< n){
                        arr[i+1]= 1*arr[i]+2*arr[i+1];
                        int j = i;
                        while(j< n-1){
                                if(arr[j]>arr[j+1]){
                                        int temp= arr[j];
                                        arr[j]= arr[j+1];
                                        arr[j+1] = temp;
                                }
                                j++;
                        }
                        i++;
                }
                if(i>0){
                        System.out.println(i);
                }else{System.out.println(-1);}
        }
}
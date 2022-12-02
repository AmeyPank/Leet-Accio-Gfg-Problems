import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                long arr[] = new long[n];
                for(int i = 0; i < n; i++)
                        arr[i] = sc.nextLong();
                long ans[] = new long[n];
                Stack<Long> st = new Stack<>();

                for(int i = n - 1; i >= 0; i--){
                        // currVal = arr[i]
                        while(!st.empty() && st.peek() <= arr[i]){
                                st.pop();
                        }
                        // I will have removed all the elements <= arr[i]
                        // I would be having NGE at st.peek()
                        if(st.empty()){
                                ans[i] = -1;
                        }
                        else {
                                ans[i] = st.peek();
                        }
                        st.push(arr[i]);
                }
                for(int i = 0; i < n; i++){
                        System.out.print(ans[i] + " ");
                }
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                Queue<Integer> q = new LinkedList<>();
                for(int i = 0; i < n; i++){
                        q.offer(sc.nextInt());
                }
                Stack<Integer> st = new Stack<>();
                for(int i = 0; i < k; i++){
                        st.push(q.poll());
                }
                for(int i = 0; i < k; i++){
                        q.offer(st.pop());
                }
                for(int i = 0; i < q.size() - k; i++){
                        q.offer(q.poll());
                }
                for(int i = 0; i < n; i++){
                        System.out.print(q.poll() + " ");
                }
		// put first k elements to stack
                // insert these back to queue
                // remove the first n - k elements from q, push it back to q
	}
}
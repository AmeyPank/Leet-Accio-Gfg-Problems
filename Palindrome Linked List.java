import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
        int val;
        Node next;
        Node(int val){
                this.val = val;
        }
}
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n  = sc.nextInt();
                Node head = new Node(sc.nextInt());
                Node temp = head;
                for(int i = 0; i < n - 1; i++){
                        temp.next = new Node(sc.nextInt());
                        temp = temp.next;
                }

                Stack<Integer> st = new Stack<>();
                temp = head;
                while(temp != null){
                        st.push(temp.val);
                        temp = temp.next;
                }
                // Now stack contains the values in reverse Order
                temp = head;
                while(temp != null){
                        if(temp.val != st.peek()){
                                System.out.println("NO");
                                return; // returning from the main() Function
                        }
                        temp = temp.next;
                        st.pop();
                }
                System.out.println("YES");
	}
}


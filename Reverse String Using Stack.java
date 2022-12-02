import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
		String str = sc.next();

                // Create a stack to store Character
                Stack<Character> st = new Stack<>();

                // Store the characters of String in stack
                for(int i = 0; i < str.length(); i++){
                        st.push(str.charAt(i));
                }

                // Now we have the stack populated correctly
                // top to down, the stack stores reverse of String str

                String ans = "";
                // You want to add the currently popped element to get added 
                // to the end
                ans = ans + st.pop();
                while(!st.empty()){
                        // System.out.print(st.pop());
                        ans = ans + st.pop();
                }
                System.out.println(ans);
	}
}


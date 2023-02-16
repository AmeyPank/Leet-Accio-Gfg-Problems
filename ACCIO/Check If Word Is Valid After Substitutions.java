import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public boolean isValid(String s) {
        // Your code here.
		 Stack<Character>  st = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'c'){
                if(st.size()>= 2 && st.pop() == 'b' && st.pop()=='a'){

                }else{
                    return false;
                }
            }else {
                st.push(ch);
            }
        }
        return st.size()== 0;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        Solution Obj = new Solution();
        boolean ans = Obj.isValid(str);
        System.out.println(ans);
    }
}
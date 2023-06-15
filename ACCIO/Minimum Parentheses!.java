/*Given a string s of parentheses ‘(‘ or ‘)’.

The task is to find the minimum number of parentheses ‘(‘ or ‘)’ (at any positions) we must add to make the resulting parentheses string valid.

A string is valid if:

Open brackets must be closed by the corresponding closing bracket.

Open brackets must be closed in the correct order.

Input Format
The first line given is a string s.

Output Format
Print a single integer denoting the minimum number of parentheses ‘(‘ or ‘)’ (at any positions) we must add in A to make the resulting parentheses string valid.

Example 1
Input

())
Output

1
Example 2
Input

(((
Output

3*/ 

import java.util.*;

class Accio{
    static int MinimumParantheses(String s){
        //write code here
		 Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }

        return count + stack.size();
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Accio obj = new Accio();
        int ans = obj.MinimumParantheses(s);
        System.out.println(ans);
    }
}
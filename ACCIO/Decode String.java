// Approach 1: Smart Brute Force
// We can run an algorithm to solve this by using these steps:

// Initialize an empty stack, curnum = 0, curString = ''
// For character i in string,
// if i is [, append curString and curNum to stack, set curString and curNum to zero.
// if i is ], num = stack.top(), prevString = stack.top(), curString = prevString + num*curString
// if i is digit, curNum = curNum*10 + idea
// else curString += i
// return curString

// Time Complexity:

// O(N).

// Space Complexity:

// O(N).

// Below is the implementation of above idea:

// 1. Java:

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.decodeString(str);
    }
}
class Solution {
    public static void decodeString(String s) {
       Stack<String> stack = new Stack<>();
       for (Character c: s.toCharArray()){
           if(c!=']'){
               stack.push(String.valueOf(c));
           } else {
               StringBuilder sb = new StringBuilder();
               while (!stack.isEmpty() && !stack.peek().equals("[")){
                   sb.insert(0, stack.pop());
               }
               String str = sb.toString();
               sb.setLength(0);
               stack.pop();

               while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                   sb.insert(0, stack.pop());
               }
               int num = Integer.parseInt(sb.toString());
               for (int i=0; i<num; i++){
                   stack.push(str);
               }
           }
       }
       String ans = String.join("", stack);
       System.out.println(ans);
    }
}
/*Sleep In
You are given the values of two parameters weekday and vacation which can be true or false. The parameter weekday is true if it is a weekday else it will be false. Similarly the parameter vacation is true if you are on vacation else it will be false. You can Sleep In only if it is not a weekday or you are on vacation. Find out if you can Sleep In given the parameters weekday and vacation.

Input Format
The first line of input contains two characters whose values maybe T or F where first values represents weekday and second represents vacation.

Output Format
The only line of output contains T or F depending upon if you can Sleep In.

Note: Here T means true and F means false.

Example 1
Input

T T
Output

T
Explanation: It is a weekday but you are on vacation hence you can Sleep In.

Example 2
Input

T F
Output

F
Explanation: It is a weekday and you are not on vacation hence you cannot Sleep In.*/
import java.util.*;

class Solution {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            // It's not a weekday or you're on vacation, so you can sleep in
            return true;
        } else {
            // It's a weekday and you're not on vacation, so you can't sleep in
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean w = scn.next().charAt(0) == 'T' ? true : false;
        boolean v = scn.next().charAt(0) == 'T' ? true : false;
        scn.close();
        Solution Obj = new Solution();
        if (Obj.sleepIn(w, v)) {
            System.out.print("T");
        } else {
            System.out.print("F");
        }
    }
}
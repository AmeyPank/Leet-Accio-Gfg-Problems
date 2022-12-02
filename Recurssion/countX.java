import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution sol = new Solution();

        int ans= sol.countX(str);
        System.out.println(ans);
    }
}
class Solution {

    public int countX(String str) {
        if (str.equals("")) {
            return 0;
        }
        else {
            char leftMostchar = str.charAt(0);
            str = str.substring(1);

            if (leftMostchar == 'x') {
                return 1 + countX(str);
            }
            else {
                return 0 + countX(str);
            }
        }
    }
}

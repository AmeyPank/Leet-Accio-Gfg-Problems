/*Lines and Stars
Given integers m and n, you must print m lines with n stars each.

You have to complete lineStars function which consists of integer inputs m and n and prints the required pattern using *.

Input Format
The first line of input contains the integer m and n.

Output Format
The output should contain m lines, with each line containing n stars each.

Example 1
Input

4 3
Output

***
***
***
***                                                                    
Explanation

Each 4 lines has 3 stars *.

Example 2
Input

7 1
Output

*
*
*
*
*
*
**/
import java.util.*;

class Accio {
    public void linesStars(int m, int n) {
        // iterate over each line
        for (int i = 0; i < m; i++) {
            // iterate over each star in the line
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // go to the next line
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Accio Obj = new Accio();
        Obj.linesStars(m, n);
        sc.close();
    }
}
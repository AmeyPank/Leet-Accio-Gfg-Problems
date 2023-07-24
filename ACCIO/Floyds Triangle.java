/*Input Format
Input contains the integer N.

Output Format
Print the pattern for the value of N.

Example 1
Input

5
Output

1 
2 3 
4 5 6 
7 8 9 10       
11 12 13 14 15 
Example 2
Input

3
Output

1 
2 3 
4 5 6  */ 

import java.util.*;

class Accio {
    public void printTriangle(int n) {
        // write code here
		int num = 1; // number to print
        for (int i = 1; i <= n; i++) { // loop for each row
            for (int j = 1; j <= i; j++) { // loop for each column
                System.out.print(num + " "); // print the number and a space
                num++; // increment the number
            }
            System.out.println(); // move to the next line
        }
    }
}

public class Main {
    public static void main(    String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        Obj.printTriangle(n);
    }
}


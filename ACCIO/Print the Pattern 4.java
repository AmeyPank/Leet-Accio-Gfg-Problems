/*Print the Pattern 4
Take input of x from the user and write a program to print the it''s multiplication table up to 10 in format given below

x * 1 = x
x * 2 = 2x
. . .
x * 10 = 10x		
Complete the given function. */ 
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        // Write your code here
		for (int i = 1; i <= 10; i++) {
            int result = x * i;
            System.out.println(x + " * " + i + " = " + result);
        }
    }
}
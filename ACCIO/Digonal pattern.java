/*
Diagonal Pattern - 2
Write a Java program where you are given a number n, you've to create a pattern of * and separated by tab as shown in the output format.

Input Format
A number n

Output Format
    *
   *
  *
 *
*
Example 1
Input

3
Output

  *
 *
*
Example 2
Input

7
Output

      *
     *
    *
   *
  *
 *
**/ 

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		  Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Iterate over each row
        for (int i = 0; i < n; i++) {
            // Print spaces for each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print * for each row
            System.out.println("*");
        }
	}
}
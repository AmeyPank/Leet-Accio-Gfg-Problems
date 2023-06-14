/*Write a Java program to check if a given set of numbers is a valid pythagorean triplet.

Pythagorean triples are a^2+b^2 = c^2 where a, b and c are the three positive integers. 
These triples are represented as (a,b,c). Here, a is the perpendicular, b is the base and c is 
the hypotenuse of the right-angled triangle.
*/ 

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isPythagoreanTriplet = isPythagoreanTriplet(a, b, c);

        if (isPythagoreanTriplet) {
        System.out.print(true);
		}else{
			System.out.print(false);
		}
    }
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Check if a^2 + b^2 = c^2
        return a * a + b * b == c * c;
    }
}

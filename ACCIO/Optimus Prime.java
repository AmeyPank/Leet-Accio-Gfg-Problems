/*Optimus Prime
Given an integer n, print all prime numbers between 1 and n (both inclusive).

Example:

If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:

2
3
5
7*/ 
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
		   printPrimeNumbers(n);
    }

    static void printPrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
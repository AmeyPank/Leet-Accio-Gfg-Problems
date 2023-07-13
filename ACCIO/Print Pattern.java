/*  1
   222
  33333
 4444444
555555555*/ 
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int N = input.nextInt();;

        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(i);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
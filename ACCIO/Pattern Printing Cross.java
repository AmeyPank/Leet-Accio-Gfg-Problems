import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
	
	//Write code here
	  for (int i = 1; i <= n; i++) {
      
      // loop to print asterisks in each row
      for (int j = 1; j <= n; j++) {
        // print asterisk if on diagonal
        if (i == j || j == (n - i + 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      
      // move to next line after each row is printed
      System.out.println();
    }
  }
}


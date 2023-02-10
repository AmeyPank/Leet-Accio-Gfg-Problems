// Approach
// Take a variable which represents the current integer to be printed in the line and increment it by two as we move to next line.

// Time Complexity

// O(n ^ 2)

// Space Complexity

// O(1)

// Implementation

// 1. Java

import java.util.*;

public class Main {

    public static void main(String[] args) throws Throwable {
     
      Scanner cs=new Scanner(System.in);
      // System.out.println("Enter the row size:");

      int row_size,out,in1,in2;
      int np=1;
      row_size=cs.nextInt();
  
     for(out=0;out<row_size;out++)
     {
     for(in1=row_size-1;in1>out;in1--)
     {
         System.out.print(" ");
     }
     for(in2=0;in2<np;in2++)
     {
         System.out.print(np);
     }
     np+=2;
     System.out.println();
     }
   cs.close();
    }
}
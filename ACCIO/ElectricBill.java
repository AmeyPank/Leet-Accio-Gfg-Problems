// Approach:
// See in which range the Units lies and answer accordingly.

// Code:

// Java:


import java.util.*;

public class Main {
   public static int calculateBill(int units)
    {
 
        // Condition to find the charges
        // bar in which the units consumed
        // is fall
        if (units <= 100) {
            return units * 10;
        }
        else if (units <= 200) {
            return (100 * 10)
                + (units - 100)
                      * 15;
        }
        else if (units <= 300) {
            return (100 * 10)
                + (100 * 15)
                + (units - 200)
                      * 20;
        }
        else if (units > 300) {
            return (100 * 10)
                + (100 * 15)
                + (100 * 20)
                + (units - 300)
                      * 25;
        }
        return 0;
    }
    public static void main(String[] args) throws Throwable {
         Scanner sc = new Scanner(System.in) ;
         int units=sc.nextInt() ; 
         int bill=calculateBill(units);
         System.out.println(bill);
    }
}

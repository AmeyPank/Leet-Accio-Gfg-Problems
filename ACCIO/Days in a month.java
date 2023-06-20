/*Days in a month
Write a program to print the number of days in a month.

Input format
- line contains the number of month from 1 to 12 
- line contains the year
Output format
print the number of days in the particular month in the particular year
Example 1
Input format

2
2016
Output format

29
Example 2
Input format

1
2009
Output format

31*/ 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the month number
        int month = scanner.nextInt();
        
        // Read the year
        int year = scanner.nextInt();
        
        // Calculate the number of days
        int days = getNumberOfDays(month, year);
        
        // Print the result
        System.out.println(days);
    }
    
    public static int getNumberOfDays(int month, int year) {
        // Array to store the number of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if it's a leap year and update the number of days in February
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        // Return the number of days for the given month
        return daysInMonth[month - 1];
    }
    
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

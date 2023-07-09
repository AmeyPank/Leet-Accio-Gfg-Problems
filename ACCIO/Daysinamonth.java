import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the month number from the user
        int month = sc.nextInt();
        // Get the year from the user
        int year = sc.nextInt();
        // Determine the number of days based on the month and year
        int days = getNumberOfDays(month, year);
        // Print the result
        System.out.println(days);
    }

    // Function to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int days;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;

            case 2: // February
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                return -1;
        }

        return days;
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

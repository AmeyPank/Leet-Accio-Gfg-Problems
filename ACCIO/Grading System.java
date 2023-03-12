import java.util.*;


public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        scanner.close();
        String message = getMessage(marks);
        System.out.println(message);
    }

    public static String getMessage(int marks) {
        if (marks > 90) {
            return "Excellent";
        } else if (marks > 80) {
            return "Good";
        } else if (marks > 70) {
            return "Fair";
        } else if (marks > 60) {
            return "Meets Expectations";
        } else {
            return "Below Expectations";
        }
    }
       // Your code here
    }
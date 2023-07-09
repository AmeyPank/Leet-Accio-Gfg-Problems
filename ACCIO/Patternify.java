import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] pattern = Solution.generatePattern(n);
        for (String row : pattern) {
            System.out.println(row);
        }
    }
}

class Solution {
    public static String[] generatePattern(int n) {
        String[] result = new String[n];

        int i, j;

        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
            StringBuilder row = new StringBuilder();

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                row.append("*");
            }

            // store the row in the result array
            result[n - i] = row.toString();
        }

        return result;
    }
}

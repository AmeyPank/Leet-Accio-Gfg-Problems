import java.util.*;

class Solution {
    public static double triangle_area(double h, double b) {
        // Write your code here
		double area = 0.5 * h * b;   // formula
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        System.out.println(Solution.triangle_area(height, base));
    }
}
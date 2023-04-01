import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int pi = 3;
        //Write your code here

		int area= pi*radius*radius;
        int perimeter = 2*pi*radius;
                
        System.out.println(area);
                
        System.out.println(perimeter);
    }
}

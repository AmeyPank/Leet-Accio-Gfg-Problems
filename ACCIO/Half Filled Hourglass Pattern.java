import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.printHourglassPattern(n);
    }
}
class Solution {
    static void printHourglassPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1)
                    System.out.print("*");
                else if(j==i || j==n-1-i)
                    System.out.print("*");
                else if(i>n/2 && j<=i && j>=n-1-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
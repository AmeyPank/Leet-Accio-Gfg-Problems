import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        // write code here
        for(int i = 1; i <= a && i <= b; i++)
        {
//returns true if both conditions are satisfied
            if(a%i==0 && b%i==0)
//storing the variable i in the variable gcd
                 gcd = i;
        }
//prints the gcd
        System.out.println(gcd);
    }
}

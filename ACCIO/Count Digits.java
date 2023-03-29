import java.util.*;

public class Main {
    static int numDigits(int n){
        //Write your code here
		int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numDigits(n));
    }
}

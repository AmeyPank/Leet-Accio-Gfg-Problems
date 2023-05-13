import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int ans = sumDigit(n);
        System.out.println(ans);      
		sc.close();
    }

	static int sumDigit(int num ) {
        //Write your code here
		 if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumDigit(num / 10);
        }
    } 
}
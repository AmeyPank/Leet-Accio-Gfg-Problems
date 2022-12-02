import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "ACCIOJOB";

        repeatString(str, n);

    }

    public static void repeatString(String str, int n) {
        if (n > 0) {
            System.out.println(str);
            n = n - 1;
            repeatString(str, n);
        } else {

            return;

        }
    }
}
import java.util.*;

class Accio{
    static boolean TriangularNumber(int n){
        //write code here
		  int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
	    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio obj = new Accio();
        boolean ans = obj.TriangularNumber(n);
        if(ans){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}

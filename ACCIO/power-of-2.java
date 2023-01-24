import java.util.*;

class Solution{
	public static boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        return ((n&(n-1)) == 0);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Solution.isPowerOfTwo(n));
    }
}
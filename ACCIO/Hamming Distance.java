import java.util.*;

class Accio{
    static int HammingDistance(int a,int b){
        //write code here
		// XOR the two numbers
        int xorResult = a ^ b;

        // Count the number of set bits (1s) in the XOR result
        int hammingDistance = 0;
        while (xorResult != 0) {
            if ((xorResult & 1) == 1) {
                hammingDistance++;
            }
            xorResult >>= 1;
        }

        return hammingDistance;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Accio obj = new Accio();
        int ans=obj.HammingDistance(a,b);
        System.out.println(ans);
    }
}

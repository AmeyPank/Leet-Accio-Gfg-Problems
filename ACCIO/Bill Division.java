import java.util.*;

class Accio {
    static int BillDivision(int n, int k, int[] bill, int charge) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                total += bill[i];
            }
        }

        int actual = total / 2;
        int charged = charge;

        if (actual == charged) {
            return 0;
        } else {
            return charged - actual;
        }
    }
}


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for(int i=0;i<n;++i){
            bill[i] = sc.nextInt();
        }
        int charge = sc.nextInt();
        Accio obj = new Accio();
        int ans=obj.BillDivision(n,k,bill,charge);
        System.out.println(ans);
    }
}
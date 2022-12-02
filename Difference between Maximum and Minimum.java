import java.util.Scanner;

class Accio{

    static int DifferencebetweenMaximumandMinimum(int n, int[] arr){
        int maximum = -(int)(1e8); // what is this Statement means i.e -(int)(1e8)
        
        int minimum = (int)1e8;

        for(int i=0;i<n;++i){
            maximum = Math.max(maximum,arr[i]);
            minimum = Math.min(minimum,arr[i]);
        }
        int ans = 0;
        int diff = maximum-minimum;
        for(int i=0;i<n;++i){
            if(arr[i] > diff) ans++;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[]=new int[n];
    for(int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }
    Accio obj = new Accio();
    int ans=obj.DifferencebetweenMaximumandMinimum(n,nums);
    System.out.println(ans);
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(product(x, y));
        // int ans = multiply(x, y);
        // System.out.println(ans);
    }
    static int multiply(int x, int y){
        if(x==0 || y== 0){
            return 0;
        }else if(x==1){
            return y;
        } else{
            return multiply(x-1, y)+ y;
        }
    }
    static int product(int x, int y){
        if(y==1){
            return x;
        }
        System.out.println(x+ " + " +y);
        return x+product(x, y-1);
    }
}

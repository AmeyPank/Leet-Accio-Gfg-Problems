import java.util.Scanner;
class Solution {
    public static String superDigitHelper(String n) {
    if(n.length() == 1){
        return n;
    }
    long sum = 0;
    for(int i = 0; i < n.length(); i++){
        sum += n.charAt(i) - '0';
    }
    n = Long.toString(sum);

    return superDigitHelper(n);
    }

    public static String superDigit(String str, int k)
    {
        //Write your code here

        String n = new String("");
        for(int i = 0; i < k; i++){
            n += str;
        }
        return superDigitHelper(n);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int k = sc.nextInt();

        Solution Obj = new Solution();

        System.out.println(Obj.superDigit(str,k));
    }
}
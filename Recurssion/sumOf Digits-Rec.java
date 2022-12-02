import java.util.*;

class Solution {
    static int sumDigit(int n)
    {
        //Write your code here
		if(n<10){
			return n;
		}
		return (n%10)+sumDigit(n/10);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.sumDigit(n));
    }
}
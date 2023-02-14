import java.util.*;
class Solution {
    public static long countways(long n) {
      int res = 0;

		while( n!=1){
			if(n % 2 ==0){
				n = n/2;
			}else if(n==3){
				res += 2;
				break;
			}else if((n & 3) == 1){
				n = n-1;
			}else if((n & 3)==3){
				n = n+1;
			}
			res++;
		}
		return res;
    }
}

public class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(Solution.countways(n));
	}
}

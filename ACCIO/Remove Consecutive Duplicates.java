import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String ans = Solution.removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }
}

class Solution {

    static String removeConsecutiveDuplicates(String s) {
		int n = s.length();
		String res = "";
		for(int i = 0 ; i<n;i++){

			if(i<n-1 && s.charAt(i) ==s.charAt(i+1)){
				continue;
			}
			else{
				res +=s.charAt(i);
			}
		}
		return res;

    }
}

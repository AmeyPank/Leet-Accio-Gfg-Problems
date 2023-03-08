import java.util.*;

class Solution {
    public static String removeChars(String S) {
        // Write your code here
       if(S.length() <1){
		   return S;
	   }
		if(S.charAt(0) == 'a' || S.charAt(0) == 'c' || S.charAt(0) == 'i' ||S.charAt(0) == 'o' ){
			return removeChars(S.substring(1, S.length()));
		}
		return S.charAt(0)+removeChars(S.substring(1, S.length()));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Solution obj= new Solution();
        String result = obj.removeChars(S);
        System.out.println(result);
    }
}

import java.util.*;

class Solution {
    public static String mergeStrings(String a, String b) {
        //Write your code here
		String result = "";
        int length = Math.max(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
            }
        }
        return result;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = Solution.mergeStrings(a, b);
        System.out.println(result);
    }
}
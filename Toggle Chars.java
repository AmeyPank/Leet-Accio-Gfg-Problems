import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // This is newly Added
        String str = sc.nextLine();
        String ans = Solution.toggleCase(n, str);
        System.out.println(ans);
    }
}

class Solution {
    static String toggleCase(int n, String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char) (ch - 'a' + 'A');

            } else if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char) (ch - 'A' + 'a');
            }
        }
        String ans = String.valueOf(arr);
        return ans; //Testing of git
    }
}

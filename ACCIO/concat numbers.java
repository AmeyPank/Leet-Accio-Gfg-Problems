import java.util.*;

class Solution {
    public static void concatenate(int a, int b) {
        // Write your code here
	int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
    System.out.println(c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution obj= new Solution();
        obj.concatenate(a, b);
        
    }
}
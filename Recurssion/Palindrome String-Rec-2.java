import java.io.*;
import java.util.*;
//TC=O(n); space = O(1)
class Solution {
    static int isPalindrome(String str) {
        String S = str.toUpperCase();
        int l = 0;
        int r = S.length() -1;
        while(l < r){
            if( !((S.charAt(l) >= 'a' && S.charAt(l) <= 'z') || (S.charAt(l) >= 'A' && S.charAt(l) <= 'Z'))){
                l++; continue;
            }
            if( !((S.charAt(r) >= 'a' && S.charAt(r) <= 'z') || (S.charAt(r) >= 'A' && S.charAt(r) <= 'Z'))){
                r--;
                continue;
            }

    if(S.charAt(l) != S.charAt(r)){
        return 0;
    }
    l++;
    r--;
}
    return 1;
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Solution Obj = new Solution();
        int result = Obj.isPalindrome(str);
        System.out.println(result);
} }
import java.io.*;
import java.util.*;

class Solution{
    static int minOperation(String s){
		int n = s.length();
        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        if (upperCount == 0 || lowerCount == 0) {
            return 0; // already good
        }
        if (upperCount > lowerCount) {
            return lowerCount; // convert all letters to lowercase
        } else {
            return upperCount; // convert all letters to uppercase
        }
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(Solution.minOperation(s));
    }
}
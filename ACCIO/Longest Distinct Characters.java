import java.io.*;
import java.util.*;

class Solution {
   public static int longestUniqueSubsttr(String str) {
        int n = str.length();
        int maxLength = 0;  // Initialize the maximum length to 0
        int left = 0;       // Initialize the left pointer of the window

        // Create a HashSet to store the characters in the current window
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char currentChar = str.charAt(right);

            // If the current character is not in the HashSet, add it and expand the window
            while (set.contains(currentChar)) {
                // Remove the leftmost character from the HashSet and move the left pointer
                char leftChar = str.charAt(left);
                set.remove(leftChar);
                left++;
            }

            // Add the current character to the HashSet and calculate the new window size
            set.add(currentChar);
            int windowSize = right - left + 1;

            // Update the maximum length if needed
            maxLength = Math.max(maxLength, windowSize);
        }

        return maxLength;
    }
}

public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}


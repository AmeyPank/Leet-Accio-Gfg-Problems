import java.util.*;
import java.io.*;

public class Main {
   public static void isPangram(String s) {
        boolean[] letters = new boolean[26];
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If character is uppercase, convert it to lowercase
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 'a' - 'A');
            }
            
            // If character is a letter, mark it as present in the boolean array
            if (c >= 'a' && c <= 'z') {
                index = c - 'a';
                letters[index] = true;
            }
        }
        
        // Check if all letters are present in the boolean array
        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                System.out.println("not pangram");
                return;
            }
        }
        
        // If all letters are present, print pangram
        System.out.println("pangram");
    }
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static Map<Character, Integer> countCharacters(String input) {
        // Write your code here
		 Map<Character, Integer> characterCount = new HashMap<>();
		 // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // Update the count of the current character
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }

        return characterCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
		String input = sc.nextLine();  
        Map<Character, Integer> charCounts = countCharacters(input);

        // Print the character count map
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
             System.out.println("''" + entry.getKey() + "'': " + entry.getValue());
        }
    }
}
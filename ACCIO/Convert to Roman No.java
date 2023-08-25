import java.util.*;

public class Main {
    static String intToRoman(int num) {
        // Arrays to store Roman numerals and their corresponding values
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder result = new StringBuilder();
        
        // Loop through the values and symbols arrays
        for (int i = 0; i < values.length; i++) {
            // Repeat the current Roman numeral while the input number is greater than or equal to its value
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(intToRoman(n));
    }
}

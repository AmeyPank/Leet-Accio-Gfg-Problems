import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        scanner.close();
        
        String binary = convertDecimalToBinary(decimal);
        System.out.println(binary);
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning of the string
            decimal = decimal / 2;
        }
        
        return binary.toString();
    }
}

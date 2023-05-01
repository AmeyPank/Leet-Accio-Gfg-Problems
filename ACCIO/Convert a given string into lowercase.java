import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a string in uppercase letters: ");
        String str = input.nextLine();

        String lowercase = str.toLowerCase();
        System.out.println(lowercase);
    }
}
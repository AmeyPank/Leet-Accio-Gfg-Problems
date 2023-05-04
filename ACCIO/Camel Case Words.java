import java.util.*;

public class Main {
public static void CamelCaseWords(String s) {
    int n = s.length();
    int start = 0;

    for (int i = 1; i < n; i++) {
        if (Character.isUpperCase(s.charAt(i))) {
            System.out.println(s.substring(start, i));
            start = i;
        }
    }

    // Print the last word
    System.out.println(s.substring(start));
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CamelCaseWords(s);
    }
}
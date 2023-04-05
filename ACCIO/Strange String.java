import java.io.*;
import java.util.*;

public class Main {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            char ch = 'a';
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sb.insert(0, ch);
                    ch++;
                } else {
                    sb.append(ch);
                    ch++;
                }
                if (ch > 'z') {
                    ch = 'a';
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
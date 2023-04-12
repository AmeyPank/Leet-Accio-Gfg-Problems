import java.util.*;

class Solution {
    static void largestNumber(String a[], int n) {
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String left = s1 + s2;
                String right = s2 + s1;
                return right.compareTo(left);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : a) {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String a[] = new String[n];

        for(int i = 0; i < n; i++){
            a[i] = input.next();
        }
        Solution Obj = new Solution();
        Obj.largestNumber(a,n);
    }
}
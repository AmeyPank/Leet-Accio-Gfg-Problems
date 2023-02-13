import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = Solution.numberPattern(n);
        for(int i=0;i<n;i++) {
            for(int x : ans.get(i)) {
                System.out.print(x);
            }
            System.out.print("\n");
        }
    }
}

class Solution {

    static ArrayList<ArrayList<Integer>> numberPattern(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {

            result.add(new ArrayList<Integer>(i + 1));

            for (int j = 0; j <= i; j++) {

                int currentAns;

                // If end positions, then insert 1.
                if (j == 0 || j == i) {
                    currentAns = 1;
                }
                // All other tables will have 2 guests.
                else {
                    currentAns = 2;
                }
                result.get(i).add(currentAns);
            }
        }

        return result;

    }
}
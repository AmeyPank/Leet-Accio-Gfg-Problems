import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int target = sc.nextInt();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i=0;i<m;i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<n;j++) {
                arr.add(sc.nextInt());
            }
            mat.add(arr);
        }
        String ans = Solution.findTargetInMatrix(mat, m, n, target);
        System.out.println(ans);
    }
}
class Solution {

    static String findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int start = 0, end = m * n - 1;

        // Binary search.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mat.get(mid / n).get(mid % n);

            if (target < val) {
                end = mid - 1;
            } else if (target > val) {
                start = mid + 1;
            } else {
                return "TRUE";
            }
        }

        return "FALSE";
    }
}
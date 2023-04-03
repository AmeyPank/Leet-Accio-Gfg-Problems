import java.util.*;

class Solution {
    public ArrayList<Integer> SubsetSums(ArrayList<Integer> arr) {
         ArrayList<Integer> sums = new ArrayList<>();
        sums.add(0); // Add 0 as the initial sum

        for (int i = 0; i < arr.size(); i++) {
            int size = sums.size();
            for (int j = 0; j < size; j++) {
                int sum = sums.get(j) + arr.get(i);
                sums.add(sum);
            }
        }

        return sums;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(sc.nextInt());
        Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.SubsetSums(arr);
        Collections.sort(ans);
        for(int a : ans)
            System.out.print(a+" ");

    }
}

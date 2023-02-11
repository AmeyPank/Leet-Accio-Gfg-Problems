// Approach

// We check the elements by iterating over the provided array. We check if the index of an element is equal to the element and if so add it to a list/vector. We return the new vector we made.

// Java:

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numArray[] = new int[n];
        for(int i=0;i<n;i++) {
            numArray[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = Solution.valueEqualToIndices(numArray, n);
        int m = ans.size();
        for(int i=0;i<m;i++) {
            if(i == m-1) {
                System.out.print(ans.get(i) + "\n");
            }
            else {
                System.out.print(ans.get(i) + " ");
            }
        }
    }
}
class Solution {

    static ArrayList<Integer> valueEqualToIndices(int numArray[], int n) {

        ArrayList<Integer> allNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (numArray[i] == i) {
                allNumbers.add(i);
            }
        }

        if (allNumbers.size() == 0) {
            allNumbers.add(-1);
            return allNumbers;
        }

        return allNumbers;

    }
}
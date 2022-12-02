/*
Approach 1: Recursive Approach

For the base case, check if i > N. If it is, stop the recursive calls. Else print i and recurse to f(i+1,N).

Time Complexity: O(N) (As we call on the function N times which does a unit job). 

Space Complexity: O(N) (due to the call stack size which grows with the number of calls).

Below is the implementation of this algorithm:
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printtillN(N, 1);
        sc.close();
    }
}

class Solution {
    public void printtillN(int N, int i) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        printtillN(N, i + 1);
    }
}
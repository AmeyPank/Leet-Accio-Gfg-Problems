/*There are contestants standing in a row. Each contestant is assigned a rating, which is an integer. A contestant supports all those whose rating is greater than their rating.

Now for each contestant standing in the row, you need to tell the rating of its closest supporter on the left.

If no supporter is there, store -1 in that place.

Input Format
The first line an integer n which denotes the size of the row array.

Next line contains n space separated integers which are the elements of the row array.

Output Format
Return an integer array in which each element denotes the rating of the closest supporter on the left.

Example 1
Input

5
3 1 5 12 10
Output

-1 -1 1 5 5
Explanation

There is no contestant on the left of 1st contestant
No contestant’s rating is less than this player, hence -1.
Both ratings 3 and 1 are smaller than the current rating, but ‘1’ is closest.
All ratings are small, but the nearest one is ‘5’.
For ‘10’, the nearest rating is ‘5’, as contestant 4 is not a supporter.
Example 2
Input

6
9 8 1 2 5 5
Output

-1 -1 -1 1 2 2
Explanation

For the first ''3'' contestants, there is no supporter.
For contestant ''4'', the only supporter is contestant ''3'', with the rating ''1''.
Both ratings ''1'' and ''2'' are smaller than the current rating, but ‘2’ is closest.
The rating of contestant ''5'' is not less than the current contestant, hence the closest supporter is 4th, with a*/ 

import java.util.*;

class Solution {
    public int[] prevSmall(int[] row) {
        int n = row.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && row[i] <= row[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = row[stack.peek()];
            }

            stack.push(i);
        }

        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] res = obj.prevSmall(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

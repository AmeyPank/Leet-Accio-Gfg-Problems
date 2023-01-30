// Approach 1:
// The algorithm works by first emptying the queue and pushing all of its elements onto the stack. The elements on the stack will now be in reverse order. Then, the algorithm pops the elements off the stack and enqueues them back into the queue, which reverses the order again and gives the original order of the elements.

// Algorithm:

// Create an empty stack.
// While the queue is not empty, dequeue an element from the queue and push it onto the stack.
// While the stack is not empty, pop an element from the stack and enqueue it back into the queue.
// Return the queue.
// Time Complexity: O(n)

// Space Complexity: O(n).

// Below is the implementation of the above idea:

// 1. Java

import java.util.*;
import java.util.LinkedList;


class Solution {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        int n = q.size();
        ArrayList<Integer> al = new ArrayList<>();


        for (int i = 0; i < n; i++)
            al.add(q.remove());


        for (int i = n - 1; i >= 0; i--)
            q.add(al.get(i));


        return q;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(scn.nextInt());
        }
        scn.close();
        Solution Obj = new Solution();
        Queue<Integer> ans = Obj.reverseQueue(q);
        while (!ans.isEmpty()) {
            System.out.print(ans.peek() + " ");
            ans.remove();
        }
    }
}
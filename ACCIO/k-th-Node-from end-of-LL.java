//  Approach 1:
// Two Pointer Method Initialize two pointers to the head of the list. Move the first pointer
// k steps ahead, and then move both pointers until the first pointer is at the end. Then the second pointer
// will point to the kth node from the end.
//
//        Time Complexity: O(N)
//
//        Space Complexity: O(1)
//
//        Below is the implementation of this algorithm:
//
//        Java
import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node a = head; for(int i=1;i<n;i++) {
            Node temp = new Node(sc.nextInt());
            a.next = temp; a = a.next;
        }
        Node ans = Solution.findKthFromLast(head, k);
        System.out.println(ans.data);
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
} class Solution {
    static Node findKthFromLast(Node head, int K) {

        /* Initialize back and front pointer to head */

        Node back = head;
        Node front = head;

    // Move front pointer k steps ahead
    for (int i = 0; i < K; i++) {
        front = front.next;
    }

    // Move back and front pointer in parallel
    while (front != null) {
        back = back.next;
        front = front.next;
    }

    // Back will be pointing to k-th node from last
    return back;

}
}
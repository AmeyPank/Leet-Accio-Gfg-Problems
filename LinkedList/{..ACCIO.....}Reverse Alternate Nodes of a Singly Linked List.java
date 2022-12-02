import java.util.*;

class Solution {
    static LinkedListNode reverseAlternateNodes(LinkedListNode head) {
        // Write your code here
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        LinkedListNode ret = head;
        LinkedListNode even = head;
        LinkedListNode odd = even.next;
        even.next = even.next.next;
        even = even.next;
        odd.next = null;

        while (even != null && even.next != null) {
            LinkedListNode temp = even.next.next;
            even.next.next = odd;
            odd = even.next;
            even.next = temp;
            if (temp != null) {
                even = temp;
            }
        }
        even.next = odd;
        return ret;
    }
}

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode head = new LinkedListNode(sc.nextInt());
        LinkedListNode a = head;

        for (int i = 1; i < n; i++) {
            LinkedListNode temp = new LinkedListNode(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode ans = Solution.reverseAlternateNodes(head);
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(ans.data);
            } else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}
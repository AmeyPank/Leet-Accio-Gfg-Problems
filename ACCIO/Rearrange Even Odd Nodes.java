import java.util.*;

class Node {
    private int val;
    private Node next;

    Node(int d) {
        val = d;
        next = null;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    void addNode(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.setNext(new_node);
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getVal() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}

class Solution {
    public Node rearrangeList(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node even = null, odd = null, evenHead = null, oddHead = null;

        while (head != null) {
            Node next = head.getNext();

            if (head.getVal() % 2 == 0) {
                if (even == null) {
                    even = head;
                    evenHead = even;
                } else {
                    even.setNext(head);
                    even = even.getNext();
                }

            } else {
                if (odd == null) {
                    odd = head;
                    oddHead = odd;
                } else {
                    odd.setNext(head);
                    odd = odd.getNext();
                }
            }
            head = next;
        }

        if (even == null) {
            return oddHead;
        } else {
            even.setNext(oddHead);
            if (odd != null) {
                odd.setNext(null);
            }
            return evenHead;
        }
    }
}

public class Main {
public static void main(String[] args) {

    try{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.addNode(head);

        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.addNode(new Node(data));
        }

        Solution Obj = new Solution();
        head = Obj.rearrangeList(head); // After rearranging the linked list, store the reference of the new head node in 'head'.
        llist.printList(head);  // Then print the final Linked List.

        sc.close();

    } catch (Exception e){
        System.out.println("An error occurred : " + e.getMessage());
        e.printStackTrace();
    }
}

}

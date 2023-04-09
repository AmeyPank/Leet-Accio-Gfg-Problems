import java.util.*;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class Main {
    public static void partition(Node head, int x) {
        Node lessHead = new Node(0); // head of the list with nodes < x
        Node lessTail = lessHead; // tail of the list with nodes < x
        Node greaterHead = new Node(0); // head of the list with nodes >= x
        Node greaterTail = greaterHead; // tail of the list with nodes >= x

        // Traverse the original linked list and add each node to the appropriate partition
        while (head != null) {
            if (head.val < x) {
                lessTail.next = head;
                lessTail = lessTail.next;
            } else {
                greaterTail.next = head;
                greaterTail = greaterTail.next;
            }
            head = head.next;
        }

        // Connect the two partitions
        greaterTail.next = null; // Set the next pointer of the last node in the greater partition to null
        lessTail.next = greaterHead.next; // Connect the end of the less partition to the beginning of the greater partition

        // Set the head of the list to the head of the less partition
        head = lessHead.next;

        // Print the new linked list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create the linked list
        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            tail.next = new Node(sc.nextInt());
            tail = tail.next;
        }

        // Partition the linked list based on the given value
        int x = sc.nextInt();
        partition(head, x);
    }
}

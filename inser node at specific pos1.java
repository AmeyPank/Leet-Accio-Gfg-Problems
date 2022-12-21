//Approach 1: Straightforward Approach
//
//        If ‘pos’ is 0 means that we have to add a node at the beginning of the linked list so just make a new node and set its ‘next’ to the head of the linked list and then set the head of the linked list to the new node. If ‘pos’ is ‘n’ means that we have to add a node at the end of the linked list so just traverse till the end of the linked list and set the ‘next’ of the end node to the new node. If ‘pos’ is in the range [1, n-1] then we simply traverse till ‘pos - 1’th node and add the new node just after that node, lets denote the node at ‘pos - 1’ as ‘curr’ and the new node that we have to add as ‘newNode’ we have to just set ‘newNode → next = curr → next’ and ‘curr → next = newNode’.
//
//        Algorithm :
//
//        Make a new node to insert in the list.
//        If ‘POS’ is 0 a. Set ‘newNode -> next = head’. b. Assign ‘head = newNode’. c. Return.
//        Assign ‘temp’ to ‘head’.
//        while ‘temp->next’ is not equal to NULL a. ‘n += 1’ b. ‘temp = temp -> next’.
//        If ‘POS’ is ‘N’ a. ‘temp -> next = newNode’. b. Return.
//        Assign ‘temp’ to ‘head’.
//        Move ‘temp’ at ‘POS - 1’ (say iterator ‘i’) a. ‘temp = temp -> next’.
//        ‘newNode -> next = temp -> next’.
//        ‘temp -> next = newNode’
//        Time Complexity : O(N), where ‘N’ is the size of the linked list.
//
//        Space Complexity : O(1)
//
//        Below is the implementation of the above idea:
//
//        Java
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data; next = null;

    }
}
class LinkedList{
    Node head;
    oid add(int data ){
        Node new_node = new Node(data);
        if(head == null){ head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        } current.next = new_node;
    }
}


class Solution {
    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.
        Node newNode = new Node(val);

    if (pos == 0) {
        newNode.next = head;
        head = newNode;
        return head;
    }
    Node  temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    if (pos == n) {
        temp.next = newNode;
        return head;
    }
    temp = head;
    for (int i = 0; i < pos - 1; i++) {
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    return head;
}
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int val = sc.nextInt();
        int pos = sc.nextInt();

        Node head = Solution.insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
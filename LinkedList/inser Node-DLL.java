import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int val;
    Node next;
    Node prev; // NEW
    Node(int val){
        this.val = val;
    }
}
class DoublyLinkedList{
    Node head, tail; // tail is NEW
    void insertAtEnd(int val){
        Node n = new Node(val);

        // If Linked List is empty
        if(head == null){
            head = n;
            tail = n;
            return;
        }

        // Insert the new Node 'n' next to the last Node (tail Node)
        tail.next = n;
        n.prev = tail; // NEW
        tail = n; // NEW
    }
    void insertAtHead(int val){
        Node n = new Node(val);

        // If LL is empty
        if(head == null){
            head = n;
            tail = n;
            return;
        }

        // Insert before the head Node
        head.prev = n; // NEW
        n.next = head;
        head = n;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        DoublyLinkedList dl1 = new DoublyLinkedList();
        for(int i = 0; i < n; i++){
            dl1.insertAtEnd(sc.nextInt());
        }
        dl1.insertAtHead(k);
        dl1.print();
    }
}


//Approach: We initalise a new linked list and traverse the given two linked lists. For each element in new list, we compare the elements currently being pointed at by pointeers, and keep adding the lower element to the new list. In the end, we will always have sorted list.
//
//        Algorithm:
//
//        Initialise a dummy node.
//        Make a pointer to remember this node.
//        Keep two pointers at head of both the given linked lists.
//        At each step, compare which element is smaller amongst the two list, add it to new list and move the pointer forward in that list.
//        If one of the list is exhausted, simply append rest of the list in the new list.
//        Return the head->next pointer of new list as it will remove the dummy and return actual head.
//        Time Complexity: O(m+n) where m,n are length of both the linked lists. Space Complexity: O(m+n) to store the result.
//
//        Code:
import java.io.*; 
import java.util.*;
class Node{ 
    int data; 
    Node next; 
    Node(int data){ 
        this.data = data; next = null; 
    } 
} class LinkedList{ 
    Node head; 
    void add(int data ){ 
        Node new_node = new Node(data); 
        if(head == null){ head = new_node; 
            return; 
        } 
        Node current = head; 
        while(current.next !=null){ 
            current = current.next; 
        } 
        current.next = new_node; 
    } 
}

class Solution { 
    static Node merge(Node x, Node y){ 
        Node g = new Node(-1); 
        Node z = g; 
        while(x != null && y != null){ 
            if(x.data < y.data){ 
                z.next = x; 
                x = x.next; 
            }
            else { 
                z.next = y; 
                y = y.next; 
            } z = z.next; 
        } 
        while (x != null){ 
            z.next = x; 
            x = x.next; 
            z = z.next; 
        }
        while (y != null){ 
            z.next = y; 
            y = y.next; 
            z = z.next; 
        } 
        return g.next; 
    } 
} 
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
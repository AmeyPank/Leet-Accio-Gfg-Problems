import java.util.*;
import java.lang.*;
import java.io.*;
 
class Node{
        int val;
        Node next;
        // Constructor
        Node(int val){
                this.val = val;
                this.next = null;
        }
}


class LinkedList{
    Node head;
 
    void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
 void deleteMiddle(){
         Node prev = null;
        Node hare = head, tort = head;
        while(hare != null && hare.next != null){
            prev = tort;
            hare = hare.next.next;
            tort = tort.next;
        }
        if(prev == null){ // your LL only has 1 node
            head = null;
                return;
        }
        // tort points at the node to be deleted, prev is the prev node
        prev.next = tort.next;
        // return head;
 }
}
public class Main {
    public static void main(String args[]) {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      LinkedList list=new LinkedList();

      for(int i=0;i<n;i++){
        int x=sc.nextInt();
        list.addNode(x);
      }
            list.deleteMiddle();
            Node temp = list.head;
            if(list.head == null){
                    System.out.print(-1);
            }
            while(temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
            }
    }
}
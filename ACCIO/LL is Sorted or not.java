// Approach 1: Straightforward Approach

// Traverse the list from head to end. At each step, check if node->data <= node->next->data, 
// and output "NO" if that evaluates to false. Else output "YES" at the end.

// Time Complexity: O(N).

// Space Complexity: O(1).

// Below is the implementation of the above idea:

// Java:

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
            
        Accio A = new Accio();
        A.checkListSorted(llist.head);
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    
}

class Accio
{
    static void checkListSorted(Node head)
    {
        //Add your code here.
        Node temp=head; 
        int flag=0;
        while(temp.next!=null)
        {
            if(temp.data>temp.next.data)
            {
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if(flag==1)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
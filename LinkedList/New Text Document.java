/*
Approach: 
We need to maintain two pointers ‘odd’ and ‘even’ for current nodes at odd and even positions respectively. 
We also store the first node of the even linked list so that we can attach the even list at the end of the odd list 
after all odd and even nodes are connected together in two different lists.

Algorithm:

Get two-pointers odd and even.
Put the current node in the odd list, and it's next in the even list.
at last make the last node of the odd list point to the first node of the even list.

Time Complexity: O(N). We iterate over the linked list which would take O(N) time.

Space Complexity: O(1) We create no extra space therefore O(1) time.
*/
import java.util.*;

class Node {
    int data; Node next; Node(int d) { data = d; next = null;
    }
}

class Main {
    Node head;
    Node temp;

    public void push(int new_data)
    {
        if(head == null){

            head = new Node(new_data);

            temp =head;

            return ;
        }
        else{
            Node new_node = new Node(new_data);

            temp.next = new_node;

            temp=temp.next;

            return;
        }

    }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Main ob = new Main();
        int t=0;
        t = sc.nextInt();
        while(t-->0){
            ob.head=null;
            int n=0;
            n=sc.nextInt();
            int tn =n;
            while(tn-->0){
                int x=0;
                x = sc.nextInt();
                ob.push(x);
            }
            Solution obj = new Solution();
            Node temp = obj.oddEvenList(ob.head);
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
        sc.close();
        return;
    }
}

class Solution{
    public Node oddEvenList(Node head) {
        if (head == null) {
            return head;
        }
        Node odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {


            odd.next = even.next;

            odd = odd.next;

            even.next = odd.next;

            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
}
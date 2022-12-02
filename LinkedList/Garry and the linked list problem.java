import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
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
            Node temp = obj.segregateList(ob.head);
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
    public Node segregateList(Node head) {
        //Write code here
        if(head== null || head.next==null){
            return head;
        }
        Node dummy1= new Node(-1);
        Node dummy2 = new Node(-1);

        Node  odd = dummy1;
        Node even = dummy2;
        Node curr = head;
        int count = 1;

        while(curr!=null ){

            Node nextOfcurr = curr.next;
            curr.next=null;
            if(count%2==1){
                odd.next=curr;
                curr= nextOfcurr;
                odd = odd.next;
            }else{
                even.next=curr;
                curr = nextOfcurr;
                even = even.next;
            }

            count++;

        }
        Node oddHead = dummy1.next;
        Node evenHead= dummy2.next;

        odd.next = evenHead;

        return oddHead;
    }
}
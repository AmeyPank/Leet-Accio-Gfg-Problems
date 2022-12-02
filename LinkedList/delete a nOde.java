import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
int val;
        Node next;
        
        Node(int val){
                this.val= val;
        }
}
class LinkedList{
        Node head;
        
        void insertAtEnd(int val){
                Node n = new Node(val);
                if(head==null){
                        head=n;
                        return;
                }
                Node temp= head;
                while(temp.next!=null){
                        temp=temp.next;
                }
                temp.next=n;
        }
        
        void deleteFromPosition(int pos){
                if(pos==0){
                        head = head.next;
                        return;
                }
                Node prev= head;
                for(int i=0;i<pos-1;i++){
                        prev=prev.next;
                       
                } 
                prev.next=(prev.next).next;
        }
        
        void print(){
                Node temp=head;
                while(temp!=null){
                        System.out.print(temp.val+" ");
                        temp = temp.next;
                }
        }
}

public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                LinkedList l1 =new LinkedList();
                        for(int i=0;i<n;i++){
                        int x= sc.nextInt();
                        l1.insertAtEnd(x);
                        
                        }
                int pos = sc.nextInt();   // Enter position At end of all entered elements
                l1.deleteFromPosition(pos);
                l1.print();
	}
}
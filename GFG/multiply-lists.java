// Approach
// Use the property (A + B) % mod = (A % mod + B % mod) % mod.

// Convert the lists to integers, multiply and return.

// Algorithm
// Iterate over the lists, and find the integer equivalent. Remember to use modulo at each step.

// Multiply the integers and return. Remember the modulo.

// Time complexity
// O(max(N,M))

// Auxiliary space
// O(1)

// Below is the implementation

// Java
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        Node head=null;
        Node phead=null;
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            if(head==null)
                head=new Node(n1);
            else
                addHead(head,n1);
        }
        int m=sc.nextInt();
        while(m-->0){
            int n1=sc.nextInt();
            if(phead==null)
                phead=new Node(n1);
            else{
                addHead(phead,n1);
            }
        }
		Solution g=new Solution();
        System.out.println(g.multiplyLists(head,phead));
	}
   
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
}

class Solution{
   public long multiplyLists(Node l1,Node l2){
        //add code here.
        long mod=1000000007;
        long num1=0,num2=0;
        while(l1!=null||l2!=null){
            if(l1!=null){
                num1 = ((num1*10)%mod + (l1.data)%mod)%mod;
                l1 = l1.next;
            }
            if(l2!=null){
                num2 = ((num2*10)%mod + l2.data%mod)%mod;
                l2 = l2.next;
            }
        }
        return (num1%mod*num2%mod)%mod;
   }
}
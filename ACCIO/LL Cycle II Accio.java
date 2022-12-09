// Approach: Detect Loop using Floyd's Cycle detection algorithm and get 
// the pointer to a loop node where the fast and slow pointer met. Once they meet, 
// we will reset the slow back to head & start moving slow with 1X speed and fast 
// will carry on from where it was previously but with 1X speed. Once slow and fast 
// meet again we will return either slow or fast. Assume the distance from head to the 
// start of the loop is x1. The distance from the start of the loop to the point fast and 
// slow meet is x2. The distance from the point fast and slow meet to the start of the loop
// is x3. Distance moved by fast is x1 + x2 + x3 + x2. Distance moved by slow is x1 + x2. 
// Since, fast moves twice the distance of slow; x1 + x2 + x3 + x2 = 2 (x1 + x2). 
// On solving we get x1 = x3.

// Detect Loop using Floyd's Cycle detection algorithm and get the
// pointer to the loop node where the two pointers meet.
// Reset slow to head and move both pointers at the same speed.
// Return the node where the two pointers meet again.
// If loop does not exist return null.

// Time Complexity: O(N)

// Space Complexity: O(1)

// Below is the Java implementation of above idea:

// Java
import java.util.*; 
import java.io.*; 
import java.lang.*;

class Node { int data; Node next;

Node(int x)
{
    data = x;
    next = null;
}
}

class Main { public static void makeLoop(Node head, Node tail, int x){ if (x == 0) return;

    Node curr = head;
    for(int i=1; i<x; i++)
        curr = curr.next;
    
    tail.next = curr;
}

public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int num = sc.nextInt();
    Node head = new Node(num);
    Node tail = head;
    
    for(int i=0; i<n-1; i++)
    {
        num = sc.nextInt();
        tail.next = new Node(num);
        tail = tail.next;
    }
    
    int pos = sc.nextInt();
    makeLoop(head, tail, pos);
    
    Solution x = new Solution();
    Node y = x.detectLoop(head); 
    if( y == null )
        System.out.println(0);
    else
        System.out.println(y.data);
}
}

class Solution { public static Node detectLoop(Node head){ Node slow = head; Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
}
}
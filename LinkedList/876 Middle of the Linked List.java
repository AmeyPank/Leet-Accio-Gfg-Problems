/**

Approach 1: Count of Elements

Iterate through the list and maintain a count of total nodes. 
Then iterate through the list again and return the node that occurs at (n/2) position.

Time Complexity: O(N).

Space Complexity: O(1).

Approach 2: Two Pointer Approach

Traverse the list using two pointers fast and slow. 
Have fast jump 2 steps in each iteration, and slow jump 1 step in each iteration. 
Then when the fast pointer reaches the end, the slow pointer will be at the midpoint of the list.

Time Complexity: O(N).

Space Complexity: O(1).
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //O(n) Approach
     public ListNode middleNode(ListNode head){
        ListNode middle = head;
        ListNode last = head;
         
         while(last!=null && last.next!=null){
             
             middle= middle.next; // MIDDLE NODE
             last = last.next.next;
         }
         return middle;
     }
    
   //Approach 2 
//         public int getSize(ListNode head){
//         int len =0;
//         ListNode curr = head;

//         while(curr!=null){
//             curr = curr.next;
//             len++;
//         }

//         return len;
//     }

//     public ListNode getAt(ListNode head, int idx){
//         ListNode curr = head;

//         for(int i=0; i<idx; i++){
//             curr=curr.next;
//         }

//         return curr;
//     }

//     public ListNode middleNode(ListNode head) {
//         int size = getSize(head);

//         ListNode ans = getAt(head,size/2);
//         return ans;
//     }
}
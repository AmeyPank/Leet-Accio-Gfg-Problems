// # Intuition
// <!-- Describe your first thoughts on how to solve this problem. -->

// # Approach
// <!-- Describe your approach to solving the problem. -->

// # Complexity
// - Time complexity:
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity:
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

// # Code
// ```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     ListNode slow  =head;
     ListNode fast = head;

     while(fast!=null && fast.next!=null){
         slow = slow.next;
         fast = fast.next.next;

         if(slow == fast){
             slow = head;

             while(slow!=fast){
                 slow = slow.next;
                 fast = fast.next;
             }
             return slow;
             }
        }
        return null;
    }   
}
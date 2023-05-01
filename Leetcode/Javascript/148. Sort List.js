/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var sortList = function(head) {
    if (!head || !head.next) { // if the list has 0 or 1 nodes, it's already sorted
      return head;
    }
  
    // find the middle node of the list using the "slow and fast pointers" technique
    let slow = head;
    let fast = head.next;
    while (fast && fast.next) {
      slow = slow.next;
      fast = fast.next.next;
    }
    let middle = slow.next;
    slow.next = null; // split the list into two halves
  
    let left = sortList(head); // sort the left half recursively
    let right = sortList(middle); // sort the right half recursively
  
    // merge the two sorted halves back together
    let dummy = new ListNode();
    let pointer = dummy;
    while (left && right) {
      if (left.val < right.val) {
        pointer.next = left;
        left = left.next;
      } else {
        pointer.next = right;
        right = right.next;
      }
      pointer = pointer.next;
    }
    if (left) {
      pointer.next = left;
    }
    if (right) {
      pointer.next = right;
    }
  
    return dummy.next;
  };
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    let merged = new ListNode(); // create a dummy node to start the merged list
    let pointer = merged; // create a pointer to traverse the merged list
  
    let pointer1 = list1; // create pointers to traverse list1 and list2
    let pointer2 = list2;
  
    while (pointer1 !== null && pointer2 !== null) {
      if (pointer1.val < pointer2.val) { // compare the values at the current positions of the pointers
        pointer.next = pointer1; // add the smaller value to the merged list
        pointer1 = pointer1.next; // move the pointer for list1
      } else {
        pointer.next = pointer2;
        pointer2 = pointer2.next;
      }
      pointer = pointer.next; // move the pointer for the merged list
    }
  
    if (pointer1 !== null) { // if we reached the end of list2 first, append the remaining values from list1
      pointer.next = pointer1;
    } else if (pointer2 !== null) { // if we reached the end of list1 first, append the remaining values from list2
      pointer.next = pointer2;
    }
  
    return merged.next; // skip the dummy node and return the actual merged list
  };
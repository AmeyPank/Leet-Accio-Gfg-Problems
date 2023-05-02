/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
var mergeKLists = function(lists) {
    const values = [];
    for (let i = 0; i < lists.length; i++) {
        let current = lists[i];
        while (current) {
            values.push(current.val);
            current = current.next;
        }
    }
    values.sort((a, b) => a - b);
    const dummy = new ListNode(0);
    let tail = dummy;
    for (let i = 0; i < values.length; i++) {
        tail.next = new ListNode(values[i]);
        tail = tail.next;
    }
    return dummy.next;
};
/**
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode small = dummy1;
        ListNode big = dummy2;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                small.next = curr;
                small = small.next;
            } else {
                big.next = curr;
                big = big.next;
            }
            curr = curr.next;
        }
        big.next = null;
        small.next = dummy2.next;
        return dummy1.next;

    }
}
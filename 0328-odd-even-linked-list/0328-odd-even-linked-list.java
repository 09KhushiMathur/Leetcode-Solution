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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode odd = dummy1;
        ListNode even = dummy2;
        ListNode curr = head;
        int i = 1;
        while (curr != null) {
            if (i % 2 != 0) {
                odd.next = curr;
                i++;
                odd = odd.next;
            } else {
                even.next = curr;
                i++;
                even = even.next;
            }
            curr = curr.next;
        }
        even.next = null;
        odd.next = dummy2.next;
        return dummy1.next;

    }
}
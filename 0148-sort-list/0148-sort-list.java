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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast  = head;
        while(fast!= null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode first = sortList(head);
        ListNode second = sortList(slow);
        ListNode dummy = new ListNode(0);
        ListNode d = dummy;
        while(first!=null&&second!=null){
            if(first.val <= second.val){
                d.next = first;
                first = first.next;
                d = d.next;
            }else{
              d.next = second;
                second = second.next;
                d = d.next;  
            }
        }
        if(first != null){
            d.next = first;
        }else{
            d.next = second;
        }
        return dummy.next;
        
    }
}
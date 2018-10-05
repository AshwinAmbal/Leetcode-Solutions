/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head !=null && head.val == val)
            head = head.next;
        if(head == null)
            return null;
        ListNode slow = head, fast = head.next;
        while(fast != null){
            while(fast != null && fast.val == val){
                slow.next = fast.next;
                fast = fast.next;
            }
            slow = fast;
            if(fast != null)
                fast = fast.next;
        }
        return head;
    }
}
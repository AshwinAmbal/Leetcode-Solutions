/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode findNextNode(ListNode temp){
        if(temp.next == null) return null;
        ListNode del, next = temp.next;
        while(next!=null && next.val == temp.val){
            del = next;
            next = next.next;
            del = null;
        }
        return next;
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            temp.next = findNextNode(temp);
            temp = temp.next;
        }
        return head;
    }
}
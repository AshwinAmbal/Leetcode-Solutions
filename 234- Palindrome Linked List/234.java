/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;
        if(fast != null){
            slow = slow.next;
        }
        
        ListNode temp, slower = null;
        while(slow != null){
            temp = slow.next;
            slow.next = slower;
            slower = slow;
            slow = temp;
        }
        while(head != mid && slower != null && head.val == slower.val){
            head = head.next;
            slower = slower.next;
        }
        if(head == mid && slower == null)
            return true;
        else
            return false;
    }
}
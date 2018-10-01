/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fin = new ListNode(-3), temp = fin;
        
        while(l1!= null && l2!= null){
            if(l1.val < l2.val){
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            }
            else{
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            temp.next = new ListNode(l1.val);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2 != null){
            temp.next = new ListNode(l2.val);
            temp = temp.next;
            l2 = l2.next;
        }
        temp.next = null;
        temp = fin;
        fin=fin.next;
        temp = null;
        return fin;
    }
}
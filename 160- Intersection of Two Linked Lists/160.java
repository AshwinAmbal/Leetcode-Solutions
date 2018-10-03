/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode A = headA;
        ListNode B = headB;
        ListNode temp;
        int lenA = 1, lenB = 1;
        while(A.next!=null){
            A = A.next;
            lenA++;
        }
        while(B.next!=null){
            B = B.next;
            lenB++;
        }
        System.out.print("Here");
        if(A != B) return null;
        System.out.print("Not Here");
        
        A = headA;
        B = headB;
        int i = 0;
        if(lenB > lenA){
            while(B != null && i < lenB-lenA){
                B = B.next;
                i++;
            }
        }
        else{
            while(A != null && i < lenA-lenB){
                A = A.next;
                i++;
            }
        }
        while(A !=null && B != null && B != A){
            A = A.next;
            B = B.next;
        }
        return B;
    }
}
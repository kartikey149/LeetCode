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
    ListNode newhead;
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        
        
        ListNode l2=new ListNode(head.val);
        ListNode c=l2;
        ListNode a=head.next;
        while(a!=null){
            // int dig=a.val;
            c.next=new ListNode(a.val);
            c=c.next;
            a=a.next;
        }
        ListNode b=l2;
        ListNode last=reverse(head);
        // ListNode d=l2;
        while(b!=null){
            if(b.val!=last.val){
                return false;
            }
            b=b.next;
            last=last.next;


        }
        return true;
        
    }
    private ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
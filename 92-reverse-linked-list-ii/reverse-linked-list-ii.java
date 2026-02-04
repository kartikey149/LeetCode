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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head==null || left==right || head.next==null){
            return head;
       }
       ListNode dummy = new ListNode(0);
        dummy.next = head;


       ListNode leftadd=dummy;
       for(int i=0;i<left-1;i++){
        leftadd=leftadd.next;
       }

       ListNode rightadd=head;

       for(int i=0;i<right;i++){
        rightadd=rightadd.next;
       }

        ListNode subListTail = leftadd.next;
       ListNode curr=leftadd.next;
       ListNode prev=null;
       ListNode nextt=null;
       while(curr!=rightadd){
        nextt=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextt;
       }

       leftadd.next=prev;

       subListTail.next=rightadd;

       return dummy.next;


    }

}
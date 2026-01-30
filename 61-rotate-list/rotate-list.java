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
    // private ListNode newhead;
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null || k==0){
            return head;
        }

        
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        if (k == 0) return head;
        head=privatee(head);
        ListNode head2=head;
        for(int i=1;i<k;i++){
            head2=head2.next;
        }
        ListNode secondstart=head2.next;

        head2.next=null;

        
        ListNode firsthead=privatee(head);

        ListNode second=privatee(secondstart);

        head.next=second;

        return firsthead;

        


        

    }
    private ListNode privatee(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode nextt=null;
            while(current!=null){
                nextt=current.next;
                current.next=prev;
                prev=current;
                current=nextt;
                
            }
            return prev;
    }
}
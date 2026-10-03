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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        if(head==null || head.next==null) return head;

        ListNode curr=head;
        int jj=0;
        while(curr!=null){
        int h=k;
            ListNode t=null;
            ListNode prev=null;
            if(curr==head){

            t=curr;
            jj++;
            }
            else{

                 prev=curr;
                t=prev.next;
                prev.next=null;
                curr=t;
            }
            while(h>1 && curr!=null){
                curr=curr.next;
                h--;
                
            }
            if(h>1 || curr==null){
                prev.next=t;
                break;
            }
            

            ListNode nex=curr.next;
            curr.next=null;
            ListNode j=reverse(t);
            
            t.next=nex;
            curr=t;
            if(t!=head){
                prev.next=j;
            }
            if(jj==1){
                head=j;
                jj++;
            }
            

            
        }

        
        return head;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
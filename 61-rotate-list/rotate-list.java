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
 
        int n=length(head);
        k=k%n;
        int h=n-k;
        if(k==0) return head;
        ListNode curr=head;
        for(int i=0;i<h-1;i++){
            curr=curr.next;
        }
        ListNode nex=curr.next;
        curr.next=null;
        ListNode v=nex;
        while(v.next!=null){
            v=v.next;
        }
        
        v.next=head;

        return nex;
       
    }
    static int length(ListNode head){
        int h=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            h++;
        }
        return h;
    }
    
}
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // head=reverse(head);
        // if(head==null && head.next==null){
        //     return head;
        // }
        
        ListNode curr=head;

        int len=length(head);
        if (n == len) {
            return head.next;
        }
        for(int i=0;i<len-n-1;i++){
            curr=curr.next;
        }
        if(curr.next!=null){

        ListNode curr2=curr.next.next;
        curr.next=curr2;
        }




      
       
       return head;
       
    }
    // private ListNode reverse(ListNode head){
    //     ListNode prev=null;
    //     ListNode current=heads;
    //     ListNode nextt=null;
    //     while(current!=null){
    //         nextt=current.next;
    //         current.next=prev;
    //         prev=current;
    //         current=nextt;
    //     }
    //     return prev;
    // }
    private int length(ListNode head){
        ListNode curr=head;
        int cou=0;
        while(curr!=null){
            cou++;
            curr=curr.next;
        }
        return cou;
    }
}
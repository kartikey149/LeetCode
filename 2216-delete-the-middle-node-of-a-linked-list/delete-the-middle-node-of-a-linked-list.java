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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        int leng=lengthh(head);
        ListNode curr=head;
        for(int i=0;i<leng/2-1;i++){
            curr=curr.next;
        }
        if(curr.next.next!=null){

        curr.next=curr.next.next;
        }
        else{
            curr.next=null;
        }
        return head;
    }
    public int lengthh(ListNode head){
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
}
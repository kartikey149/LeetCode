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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        int len=lengthh(head);
        int it=(len-1)/2;
        int rev=0;
        ListNode curr=head;
        while(rev<it){
            curr=curr.next;
            rev++;
        }
        ListNode curr2=curr.next;
        curr.next=null;
        ListNode sec=reverse(curr2);
        ListNode ans1=head;
        ListNode ans2=sec;
        while(ans2!=null){
            ListNode temp1=ans1.next;
            ListNode temp2=ans2.next;

            ans1.next=ans2;
            ans2.next=temp1;

            ans1=temp1;
            ans2=temp2;
        }

    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextt=null;
        while(curr!=null){
            nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;

        }
        return prev;
    }
    public int lengthh(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}
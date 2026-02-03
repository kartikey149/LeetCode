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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode head=2;
       
        
        
        int carry=0;
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        ListNode l11=reverse(l1);
        ListNode l22=reverse(l2);
        while(l11!=null || l22!=null || carry!=0){
           int val1=l11!=null?l11.val:0;
           int val2=l22!=null?l22.val:0;
            int d=(val1+val2+carry)%10;
            carry=(val1+val2+carry)/10;
            curr.next=new ListNode(d);
            curr=curr.next;
            if(l11!=null){
            l11=l11.next;
            }
            if(l22!=null){
            l22=l22.next;
            }
        }
        
        return reverse(dummy.next);
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
    private int len(ListNode head){
        ListNode curr=head;
        int co=0;
        while(curr!=null){
            co++;
            curr=curr.next;
        }
        return co;
    }
}
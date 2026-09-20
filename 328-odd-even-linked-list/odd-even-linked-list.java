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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode curr=head;
        ListNode currf=head.next;

        ListNode j=new ListNode(0);
        ListNode j2=new ListNode(0);

        ListNode curr2=j;
        ListNode curr3=j2;
        while(curr!=null ){
            curr2.next=curr;
            curr=curr.next;
            curr2=curr2.next;
            if(curr!=null){
                curr3.next=curr;
                curr3=curr3.next;
                curr=curr.next;
            }
        }
        curr3.next=null;
        curr2.next=j2.next;
        return j.next;
        
        
        
       
    
        


    }
}
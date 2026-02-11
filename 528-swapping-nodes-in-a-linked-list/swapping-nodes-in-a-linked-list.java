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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode curr2=head;
        ListNode curr3=head;

        for(int i=0;i<(k-1);i++){
            curr=curr.next;
            
        }
        curr2=curr;
        ListNode temp=curr;
        while(temp.next!=null){
            temp=temp.next;
            curr3=curr3.next;
        }


        int tempp=curr2.val;
        curr2.val=curr3.val;
        curr3.val=tempp;
        return head;
        
        
    }
    
}
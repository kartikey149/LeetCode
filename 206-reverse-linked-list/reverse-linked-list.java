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
    private ListNode newhead;
    public ListNode reverseList(ListNode head) {
        if(head==null){

            return null;
        }
        ListNode last=privatee(head);
        last.next=null;
        head=newhead;

        return head;

        }
        private ListNode privatee(ListNode node){
            if(node.next==null){
                newhead=node;
                return node; 
            }
            else{
                ListNode last=privatee(node.next);
                last.next=node;
                return node;

            }
        }
        
        
        
    

}
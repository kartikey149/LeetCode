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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int la=lengthh(l1);
        int lb=lengthh(l2);
        ListNode l3=new ListNode();
        ListNode curr=l3;

        while(l1!=null && l2!=null){
            int val1=l1.val;
            int val2=l2.val;
            if(l1.val<l2.val){
                curr.next=new ListNode(l1.val);
                curr=curr.next;
                l1=l1.next;
            }
            else{
                curr.next=new ListNode(l2.val);
                curr=curr.next;
                l2=l2.next;

            }
            
            
        }
        while(l1!=null){
            // curr.next=l1.val;
            curr.next=new ListNode(l1.val);
            curr=curr.next;
            l1=l1.next;
        }
        while(l2!=null){
            // curr.next=l2.val;
            curr.next=new ListNode(l2.val);
            curr=curr.next;
            l2=l2.next;
        }
        return l3.next;


    }
    private int lengthh(ListNode l){
        ListNode curr=l;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}
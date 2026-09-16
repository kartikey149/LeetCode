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
        // ListNode l11=rev(l1);
        // ListNode l22=rev(l2);
        ListNode curr1=l1;
        ListNode curr2=l2;
        ListNode curr3=new ListNode();
        ListNode l3=curr3;
        ListNode d=l3;
        int carry=0;
        while(curr1!=null || curr2!=null || carry==1){
            int d1=curr1!=null?curr1.val:0;
            int d2=curr2!=null?curr2.val:0;
            ListNode s=new ListNode();
            int f=d1+d2+carry;
            int data=f%10;
            s.val=data;
            carry=f/10;
            l3.next=s;
            l3=s;
            if(curr1!=null){

            curr1=curr1.next;
            }
            if(curr2!=null){

            curr2=curr2.next;
            }
            
        }
        
        return d.next;


    }
    
    
}
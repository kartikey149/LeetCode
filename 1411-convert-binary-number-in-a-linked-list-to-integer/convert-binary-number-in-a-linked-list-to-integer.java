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
    public int getDecimalValue(ListNode head) {
        int len=length(head)-1;
        System.out.print(len);
        int sum=0;
        ListNode c=head;
        while(c!=null){
            sum+=(int)Math.pow(2,len)*c.val;
            len--;
            c=c.next;
        }
        return sum;
    }
    static int length(ListNode head){
        int i=0;
        ListNode c=head;
        while(c!=null){
            i++;
            c=c.next;
        }
        return i;
    }
}
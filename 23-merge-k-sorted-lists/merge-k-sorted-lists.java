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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length==0){
            return null;
        }
        List<Integer> ls=new ArrayList<>();

        for(ListNode l:lists){
            
            while(l!=null){
                ls.add(l.val);
                l=l.next;
            }
        }
        Collections.sort(ls);

        ListNode l=new ListNode(0);
        ListNode curr=l;

        for(int val:ls){
            curr.next=new ListNode(val);
            curr=curr.next;
        }



        

        return l.next;
    }
    

}
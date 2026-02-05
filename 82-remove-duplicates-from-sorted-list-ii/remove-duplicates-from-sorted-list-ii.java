// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null || head.next==null){
//             return head;
//         }
//        ListNode curr=head;
            
//             ListNode dummy=new ListNode(0);
//             ListNode ans=dummy;

//        while(curr!=null){
//         ListNode curr2=curr.next;
//             int count=0;
//             while(curr2!=null && curr.val==curr2.val ){
//                 count++;
//                 curr2=curr2.next;
//             }
//             if(count==0){
//                 // ans.val=curr2.val;
                
//                 ans.next=curr2;
//                 ans=ans.next;
//             }
//             curr.next=curr2;
//             // curr2=curr2.next;

//        }
//        ans.next=null;
//        return dummy.next;

       
      
        
//     }
// }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        while (curr != null) {
            // Fix 1: Reset curr2 to be the node immediately after curr every loop
            ListNode curr2 = curr.next;
            int count = 0;

            while (curr2 != null && curr.val == curr2.val) {
                count++;
                curr2 = curr2.next;
            }

            // Fix 2: count == 0 means curr had no duplicates
            if (count == 0) {
                ans.next = curr; 
                ans = ans.next;
            }

            // Fix 3: Move curr to the next distinct value (curr2)
            curr = curr2;
        }
        
        ans.next = null; // Correct: Terminates the new list
        return dummy.next;
    }
}
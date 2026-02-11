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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=llength(head);
        int seclen=0;
        int n=llength(head);
        int a=n%k;
        ListNode[] arr=new ListNode[k];
        ListNode curr1=head;
        if(len<=k){
            int i=0;
            while(curr1!=null){
                ListNode c=curr1.next;
                arr[i]=curr1;
                curr1.next=null;
                curr1=c;
                
                i++;
            }
            
        }else{
            int j=0;
            ListNode curr2=head;

            int count=0;
            while(seclen<k){
                arr[j]=curr2;
                int currlen=count<a?(n/k)+1:(n/k);
                    for(int i=0;i<currlen-1;i++){
                        // ListNode d=curr2.next;
                        curr2=curr2.next;
                    }
                    if (curr2 != null) {
                    ListNode d = curr2.next; 
                    curr2.next = null;       
                    curr2 = d;               
                }
                   
                
                
                    

                
                
                j++;
                seclen++;
                count++;
                
            }
        }
        return arr;
    }
    public int llength(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}
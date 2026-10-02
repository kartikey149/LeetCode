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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return check(head,root,head);
    }
    static boolean check(ListNode head,TreeNode root,ListNode head1){
        if(root==null ){
            return false;
        }
        
        boolean curr=false;

        if(head.val==root.val){
            if(head.next==null) return true;
            curr=check(head.next,root.left,head1) || check(head.next,root.right,head1);
        }

        if(head==head1){
            boolean again=check(head,root.left,head1) || check(head,root.right,head1);
            return curr || again;
        }

        return curr;
    }
}
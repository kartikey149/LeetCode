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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        // if(root.left.val!=root.right.val){
        //     return true;
        // }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root.left);
        q1.add(root.right);
        while(!q1.isEmpty()){
           TreeNode t1=q1.poll();
           TreeNode t2=q1.poll();
           if(t1==null && t2==null) continue;
           if(t1==null || t2==null || t1.val!=t2.val) return false;

           q1.add(t1.left);
           q1.add(t2.right);

           q1.add(t1.right);
           q1.add(t2.left);

            
        }
        return true;
    }
}
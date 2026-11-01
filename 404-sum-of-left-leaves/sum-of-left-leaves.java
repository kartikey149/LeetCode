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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int h=q.size();
            for(int i=0;i<h;i++){
                TreeNode c=q.poll();
                
                if(c.left!=null){
                    q.add(c.left);
                    if(isLeaf(c.left)){
                    sum+=c.left.val;
                }
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
        }
        return sum;
    }
    static boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }

}
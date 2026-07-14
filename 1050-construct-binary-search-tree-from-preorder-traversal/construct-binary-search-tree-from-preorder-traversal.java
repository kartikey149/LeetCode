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
    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=helper(root,preorder[i]);
        }
        return root;
        
    }
    
    private TreeNode helper(TreeNode node,int value){
        if(node==null) {
            node=new TreeNode(value);
            return node;
        }
        if(value<node.val){
            node.left=helper(node.left,value);
        }
        if(node.val<value){
            node.right=helper(node.right,value);
        }
        return node;
    }
    
}
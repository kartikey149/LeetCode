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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        in(root,ls);
        return ls;
    }
    static void in(TreeNode node,List<Integer> ls){
        if(node==null){
            return;
        }

        in(node.left,ls);
        ls.add(node.val);
        in(node.right,ls);
        


    }
}
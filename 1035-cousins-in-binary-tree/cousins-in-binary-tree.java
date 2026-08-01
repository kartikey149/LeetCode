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
    public boolean isCousins(TreeNode root, int x, int y) {
        int l=lev(root,x,0);
        int r=lev(root,y,0);

        return l==r && !isSibling(root,x,y);

    }
    static boolean isSibling(TreeNode node, int x, int y){
        if(node==null) return false;

        boolean isChildSibling = false;
        if (node.left != null && node.right != null) {
            isChildSibling = (node.left.val == x && node.right.val == y) || 
                             (node.left.val == y && node.right.val == x);
        }

        return isChildSibling || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }

    static int lev(TreeNode node,int a,int lev){
        if(node==null) return 0;

        if(node.val==a){
            return lev;
        }

        int l=lev(node.left,a,lev+1);
        if(l!=0){
            return l;
        }

        return lev(node.right,a,lev+1);
    }

}
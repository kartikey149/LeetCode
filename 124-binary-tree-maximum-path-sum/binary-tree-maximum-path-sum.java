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
    static  int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       int h=check(root);
       int ans=sum;
       sum=Integer.MIN_VALUE;
       return ans;

    }
    static int check(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,check(root.left));
        int right=Math.max(0,check(root.right));
        int get=0;
       
        get+=root.val+left+right;
        sum=Math.max(sum,get);

        return root.val+Math.max(left,right);


    }
}
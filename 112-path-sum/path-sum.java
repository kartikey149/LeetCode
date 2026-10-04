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
    public boolean hasPathSum(TreeNode root, int targetSum) {
      return sum(root,targetSum,0);
        
    }
    static boolean sum(TreeNode root,int target,int sum){
        if(root==null) return false;
        sum+=root.val;
        // if(sum>target) return false;
        if(root.left==null && root.right==null){
            return sum==target;
        }
        
        boolean left=sum(root.left,target,sum);
        boolean right=sum(root.right,target,sum);

        return left || right;

    }
}
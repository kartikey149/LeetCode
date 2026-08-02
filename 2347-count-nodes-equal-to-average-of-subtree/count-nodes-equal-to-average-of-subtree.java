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
    private int ans=0;
    public int averageOfSubtree(TreeNode root) {
     postorder(root);
     return ans;

    }
    public int[] postorder(TreeNode node){
        if(node==null){
            return new int[]{0,0};
        }

        int[] left=postorder(node.left);
        int[] right=postorder(node.right);

        int currsum=node.val+left[0]+right[0];
        int count=1+left[1]+right[1];

        if(currsum/count==node.val){
            ans++;
        }

        return new int[]{currsum,count};

    }
    
}
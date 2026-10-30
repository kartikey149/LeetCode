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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        List<Integer> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int h=q.size();
            int d=0;
            for(int i=0;i<h;i++){
                TreeNode c=q.poll();
                d+=c.val;
                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            ls.add(d);
        }
        int sum=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<ls.size();i++){
            if(sum<ls.get(i)){
                sum=ls.get(i);
                ans=i;
            }
        }
        return ans+1;
    }
}
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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        // int ans=0;
        List<Integer> ls2=new ArrayList<>();
        while(!q.isEmpty()){
        // List<Integer> ls=new ArrayList<>();
            int a=q.size();
            int j=Integer.MIN_VALUE;
            for(int i=0;i<a;i++){
                TreeNode d=q.poll();
                j=Math.max(j,d.val);
                if(d.left!=null){
                    q.add(d.left);
                }

                if(d.right!=null){
                    q.add(d.right);
                }

                // ls.add(d.val);
            }
            
            
            ls2.add(j);
        }
        return ls2;
    }
}
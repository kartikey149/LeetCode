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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode c=q.poll();
                if(c.left!=null){
                    q.add(c.left);
                }
                ls.add(c.val);
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            ans.add(0,new ArrayList<>(ls));
        }
        return ans;
    }
}
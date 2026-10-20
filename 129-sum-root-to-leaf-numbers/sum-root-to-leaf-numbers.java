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
    public int sumNumbers(TreeNode root) {
        List<String> ls=new ArrayList<>();
        if(root==null) return 0;
        generate(root,ls,new StringBuilder());
        int ans=0;

        for(int i=0;i<ls.size();i++){
           int sum=Integer.parseInt(ls.get(i));
           ans+=sum;
        }
        return ans;
    }
    static void generate(TreeNode root,List<String> ls ,StringBuilder sb){
        if(root==null) return;
        sb.append(root.val);
        if(root.left==null && root.right==null){
            ls.add(new String(sb.toString()));
        }
        else{
            generate(root.left,ls,sb);
            generate(root.right,ls,sb);
        }
        sb.deleteCharAt(sb.length()-1);
    }
}
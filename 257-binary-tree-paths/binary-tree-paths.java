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
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<String> a=new ArrayList<>();
        if(root==null) return a;
        check(root,ans,new ArrayList<>());
        for(int i=0;i<ans.size();i++){
            List<Integer> ls=new ArrayList<>(ans.get(i));
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<ls.size();j++){
                sb.append(ls.get(j));
                if(j<ls.size()-1){


                sb.append("->");
                }
            }
            a.add(sb.toString());
        }
        return a;
    }
    static void check(TreeNode root,List<List<Integer>> ans,List<Integer> ls){
        if(root==null) return;
        if(leaf(root)==true){
        ls.add(root.val);
            ans.add(new ArrayList<>(ls));
            ls.remove(ls.size()-1);
            return;
        }
        ls.add(root.val);
        check(root.left,ans,ls);
        check(root.right,ans,ls);
        ls.remove(ls.size()-1);

    }
    static boolean leaf(TreeNode root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
}
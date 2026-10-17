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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        if(root==null) return  ans;
        check(root,targetSum,0,ls,ans);
        return ans;
    }
    static void check(TreeNode root,int target,int sum,List<Integer> ls,List<List<Integer>> ans){
        if(root==null) return;
        ls.add(root.val);
        sum=sum+root.val;
        if(root.left==null && root.right==null){
            if(sum==target){
                
                ans.add(new ArrayList<>(ls));
               
            }
            
        }
        else{
               check(root.left,target,sum,ls,ans);
        
        check(root.right,target,sum,ls,ans);
            }
        
        ls.remove(ls.size()-1);


    }
}
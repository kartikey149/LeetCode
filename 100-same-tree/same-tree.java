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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        check(p,ls1);
        check2(q,ls2);
        return ls1.equals(ls2);
    }
    static void check(TreeNode p,List<Integer> ls1){
        if(p==null || p==null){
            ls1.add(null);
            return;
        } 
        ls1.add(p.val);
        check(p.left,ls1);
        check(p.right,ls1);
    }
    static void check2(TreeNode q,List<Integer> ls){
        if(q==null || q==null){
            ls.add(null);
            return;
        } 
        ls.add(q.val);
        check(q.left,ls);
        check(q.right,ls);
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        // Node curr=root;

        // while(curr!=null){
        //     Node f=curr;
        //     while(f!=null){
        //         f.left.next=f.right;
        //         if(f.next!=null){

        //         f.right.next=f.next.left;
        //         }
        //         f=f.next;

        //     }
        //     curr=curr.left!=null?curr.left:curr.right!=null?curr.right:null;
        // }


        if(root==null) return root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Node> ls=new ArrayList<>();
            for(int i=0;i<s;i++){
                Node f=q.poll();
                if(f.left!=null){
                    q.add(f.left);
                    ls.add(f.left);
                }

                if(f.right!=null){
                    q.add(f.right);
                    ls.add(f.right);
                }
            }
            for(int i=0;i<ls.size()-1;i++){
                ls.get(i).next=ls.get(i+1);
            }
        }
        return root;
    }
}
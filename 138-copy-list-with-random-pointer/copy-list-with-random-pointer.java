/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node ,Node> map=new HashMap<>();
        Node curr=head;
        Node l1=new Node(0);
        Node curr2=l1;
        while(curr!=null){
            Node a=new Node(curr.val);
            map.put(curr,a);
            curr2.next=a;
            curr=curr.next;
            curr2=a;

        }
        curr=head;
        Node c=l1.next;
        while(curr!=null){
            if(map.containsKey(curr.random)){
                c.random=map.get(curr.random);
                
            }else{
                c.random=null;
            }
                curr=curr.next;
                c=c.next;
        }
        return l1.next;
    }
}
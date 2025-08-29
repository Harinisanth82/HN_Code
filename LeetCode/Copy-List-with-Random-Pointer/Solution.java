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
        Node th = head;
        HashMap<Node,Node> map = new HashMap();
        while(th != null){
            map.put(th,new Node(th.val));
            th = th.next;
        }
        th = head;
        while(th != null){
            map.get(th).next = map.get(th.next);
            map.get(th).random = map.get(th.random);
            th = th.next;
        }
        return map.get(head);
    }
}
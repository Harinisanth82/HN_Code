/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode tail=head;
        int lgt=1;

        while(tail.next!=null){
            tail=tail.next;
            lgt++;
        }
        tail.next=head;
        k=lgt-(k%lgt); 

        ListNode newTail=head;
        for(int i=1;i<k;i++){
            newTail=newTail.next;
        }
        dummy.next=newTail.next;
        newTail.next=null;
        
        return dummy.next;
    }
}
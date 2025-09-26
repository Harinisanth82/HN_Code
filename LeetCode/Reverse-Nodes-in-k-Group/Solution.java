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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int lgt = 0;
        while(temp != null){
            lgt++;
            temp = temp.next;
        }
        ListNode dmy = new ListNode(0);
        dmy.next = head;
        ListNode group_prev = dmy;
        while(lgt >= k){
            ListNode curr = group_prev.next;
            ListNode prev = null;
            ListNode nn = null;
        
            for(int i = 0 ; i < k ; i++){
                nn = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nn;
            }
            ListNode tail = group_prev.next;
            group_prev.next = prev;
            tail.next = curr;
            
            group_prev = tail;
            lgt -= k; 
        }
        return dmy.next;
    }
}
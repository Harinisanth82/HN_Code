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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null , curr = head , next_node = head;
        while(curr != null){
            next_node = curr.next;  //It's like a backup
            curr.next = prev;
            prev = curr;
            curr = next_node;  // To move curr to next position
        }
        return prev;
    }
}
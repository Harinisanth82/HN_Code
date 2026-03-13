1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        ListNode prev = null;
14        ListNode curr = head;
15        ListNode next = null;
16        while(curr!=null){
17            next=curr.next;
18            curr.next=prev;
19            prev=curr;
20            curr=next;
21        }
22        return prev;
23    }
24}
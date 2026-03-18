1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast!=null){
17            fast = fast.next;
18            if(fast!=null){
19                slow = slow.next;
20                fast = fast.next;
21            }
22            if(slow==fast){
23                slow=head;
24                while(slow!=fast){
25                    slow=slow.next;
26                    fast=fast.next;
27                }
28                return slow;
29            }
30        }
31        return null;
32    }
33}
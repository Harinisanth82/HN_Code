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
14        ListNode slow = head, fast = head;
15        while(fast != null){
16            fast = fast.next;
17            if(fast != null){
18                slow = slow.next;
19                fast = fast.next;
20            }
21            if(slow == fast){
22                slow = head;
23                while(slow != fast){
24                    slow = slow.next;
25                    fast = fast.next;
26                }
27                return slow;
28            }
29        }
30        return null;
31        
32    }
33}
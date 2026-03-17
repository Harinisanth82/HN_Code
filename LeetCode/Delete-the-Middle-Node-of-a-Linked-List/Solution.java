1class Solution {
2    public ListNode deleteMiddle(ListNode head) {
3        if(head==null || head.next==null){
4            return null;
5        }
6        ListNode slow=head;
7        ListNode fast=head.next.next;
8        while(fast != null && fast.next != null){
9            slow = slow.next;
10            fast = fast.next.next;
11        }
12        slow.next=slow.next.next;
13        return head;
14    }
15}
1public class Solution {
2    public boolean hasCycle(ListNode head) {
3        ListNode slow = head;
4        ListNode fast = head;
5        while(fast != null){
6            fast = fast.next;
7            if(fast != null){
8                fast = fast.next;
9                slow = slow.next;
10                if(fast==slow){
11                    return true;
12                }
13            }
14        }
15        return false;
16    }
17}
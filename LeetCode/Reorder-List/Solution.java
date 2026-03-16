1class Solution {
2    public void reorderList(ListNode head) {
3        if(head == null || head.next == null){
4            return;
5        }
6        ListNode p1 = head;
7        ListNode p2 = head;
8        while(p2.next != null && p2.next.next != null){
9            p1 = p1.next;
10            p2 = p2.next.next;
11        }
12        ListNode preMiddle = p1;
13        ListNode preCurr = p1.next;
14        while(preCurr.next != null){
15            ListNode current = preCurr.next;
16            preCurr.next = current.next;
17            current.next = preMiddle.next;
18            preMiddle.next = current;
19        }
20        p1=head;
21        p2=preMiddle.next;
22        while(p1!=preMiddle){
23            preMiddle.next = p2.next;
24            p2.next = p1.next;
25            p1.next = p2;
26            p1 = p2.next;
27            p2 = preMiddle.next;
28        }
29    }
30}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, nn = head;
        while(current != null){
            nn = current.next;
            current.next = prev;
            prev = current;
            current = nn;
        }
        return prev;
    }
}
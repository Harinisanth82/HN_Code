public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        } 
        Set<ListNode> s = new HashSet();
        ListNode th = head;
        while(th.next != null){
            if(s.contains(th)){
                return th;
            }
            s.add(th);
            th = th.next;
        }
        return null;
    }
}
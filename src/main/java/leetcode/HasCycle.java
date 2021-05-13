package leetcode;

public class HasCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(head != null && head.next != null ){
            slow = head.next;
            fast = head.next.next;
            if (slow == fast )
                return true;
        }
        return false;
    }
}

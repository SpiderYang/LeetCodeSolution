package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/21 11:47
 */

public class cycleList {
    class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public boolean hasCycle(ListNode head, int pos){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}

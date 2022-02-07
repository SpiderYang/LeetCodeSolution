package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/25 0:26
 */

public class rotateRight {
    public ListNode rotateRight(ListNode head , int k){
        if (head == null)
            return head;
        ListNode fast = head, slow = head;
        int len = 1;
        while (fast != null){
            fast = fast.next;
            len++;
        }
        fast.next = head;
        int step = len - k % len;
        while(step-- > 1){
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        return tmp;
    }

    class ListNode{
        private ListNode next;
        private int val;
        public ListNode(ListNode next, int val){
            this.next = next;
            this.val = val;
        }
    }
}

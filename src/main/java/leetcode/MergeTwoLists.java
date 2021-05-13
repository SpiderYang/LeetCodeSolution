package leetcode;

public class MergeTwoLists {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    static ListNode mergeTwoList(ListNode l1, ListNode l2){
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode();
        ListNode dummy = head;
        if (l1 == null && l2 == null ) return null;

        while (p1 != null && p2 != null ){
            if(p1.val < p2.val){
                head.next = p1;
                head = p1;
                p1 = p1.next;
            }else {
                head.next = p2;
                head  = p2;
                p2 = p2.next;
            }
            if (p1 == null ) head.next = p2;
            if(p2 == null ) head.next = p1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}

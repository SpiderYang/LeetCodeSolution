package leetcode;

public class LinkedPalindrome {
    static ListNode node ;
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  static boolean isPalindrome(ListNode head ){
        node = head;
        return check(head);
  }

  static boolean check(ListNode head){
        if(head == null)
            return true;
        boolean res = check(head.next) && (head.val == node.val);
        node = node.next;
        return res;
  }

    public static void main(String[] args) {

    }

}

package leetcode;

import java.util.List;
import java.util.Stack;

public class ReverseList {

    static ListNode reverse1(ListNode head){
            Stack<ListNode> stack = new Stack<>();
            while(head != null){
                stack.push(head);
                head = head.next;
            }
            if(stack.isEmpty()) return null;
            ListNode start = stack.pop();
            ListNode dummy = start;
            while (! stack.isEmpty()){
                ListNode node = stack.pop();
                start.next = node;
                start = node;
            }
            start.next = null;
            return dummy;
    }

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

    static ListNode reverseList(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;


    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        ListNode head  = node;
        for(int i = 1; i< 3; i++){
            ListNode tmp = new ListNode(i);
            head.next = tmp;
            head = tmp;
        }
        reverseList(node);
//        while (node != null){
//            System.out.println(node.val);
//            node = node.next;
//        }


    }
}

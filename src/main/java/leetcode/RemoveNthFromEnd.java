package leetcode;

public class RemoveNthFromEnd {

    static  class Node{
        Node next;
        public Node(){}
    }
    static Node removeNthFromEnd(Node head, int n){
        int length = 0;
        while( head.next != null ){
            length++;
            head = head.next;
        }
        Node pre = head;
        if (length == n ) return head.next;
        for( int i = 0 ; i< length-n - 1; i++ ){
            pre  = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

}

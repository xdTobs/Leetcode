package L;

import X.ListNode;

import java.util.Stack;

public class L206 {
    public ListNode reverseList(ListNode head) {
        return rev(head,null);
    }
    public static ListNode rev(ListNode head, ListNode prev){
        if (head==null)return prev;
        ListNode temp = head.next;
        head.next = prev;
        return rev(temp,head);
    }

}

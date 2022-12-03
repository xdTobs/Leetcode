package M;

import X.ListNode;

import java.util.Stack;

public class M19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode second = dummy;
        ListNode first = dummy;
        while (n>0){
            second = second.next;
            n--;
        }
        while (second.next != null) {
            second = second.next;
            first = first.next;

        }
            first.next = first.next.next;


        return dummy.next;
    }
    public static void removeNext(ListNode head){
        head.next = head.next.next;
    }




    public static void main(String[] args) {
        ListNode s =removeNthFromEnd(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))),2);
        System.out.println("s");
    }

}

package M;

import X.ListNode;

import java.util.Stack;

public class M143 {
    public static void reorderList(ListNode head) {

        ListNode node = new ListNode(0);
        ListNode curr = head;
        int length =0;
        Stack<ListNode> bottomUp = new Stack<>();
        bottomUp.add(head);
        ListNode temp = head.next;
        while(temp!=null){
            bottomUp.add(temp);
            temp = temp.next;
            length++;
        }

        for (int i = 0; i < length; i+=2) {

            curr.next=new ListNode(head.val);
            head = head.next;
            curr = curr.next;
            if (!(length % 2 != 0 && i-1==length)) {
                curr.next = new ListNode(bottomUp.pop().val);
                curr = curr.next;
            }
        }
        head = head;
    }

    public static void main(String[] args) {
        reorderList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4)))));
    }

}

package M;

import X.ListNode;

public class M2 {

    public static void main(String[] args) {
        ListNode one = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode two = new ListNode(9, new ListNode(9));
        M2 sol = new M2();
        ListNode res = sol.addTwoNumbers(one,two);
        System.out.println(res);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1 = (l1), rev2 = (l2);
        ListNode res = new ListNode(0);
        ListNode resTrav = res;
        while (rev1.val != 0 || rev2.val != 0) {
            resTrav.next = new ListNode(0);
            resTrav.val += rev1.val + rev2.val;
            if (resTrav.val >= 10) {
                resTrav.val -= 10;
                resTrav.next.val++;
            }
            if(rev1.next==null&&rev2.next==null)
                break;
            if(rev1.next==null)
                rev1.next = new ListNode(0);
            if (rev2.next == null)
                rev2.next = new ListNode(0);
            rev1 = rev1.next;
            rev2 = rev2.next;
            resTrav = resTrav.next;
        }
        if (res.next != null) {
            res = reverseList(res);
            res= res.next;
            return reverseList(res);
        }
        return res;
    }
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


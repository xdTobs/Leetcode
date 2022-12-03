package L;

import X.ListNode;

public class L21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode res = head;

        if (list1==null)return list2;
        if (list2 == null )return list1;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                res.next = list1;
                list1 = list1.next;

            }
            else{
                res.next = list2;
                list2 = list2.next;

            }
            res = res.next;

        }
        while(list1!=null){
            res.next = list1;
            list1 = list1.next;
            res = res.next;

        }
        while(list2!=null){
            res.next = list2;
            list2 = list2.next;
            res = res.next;

        }
        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(-9,new ListNode(3)),new ListNode(5,new ListNode(7))));
    }
}

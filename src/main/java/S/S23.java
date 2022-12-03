package S;

import X.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class S23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length==0) return null;
    ListNode l1 = null;
    ListNode l2 = null;
    while(lists.length>1){
        List<ListNode> mergedLists = new ArrayList<>();
        for (int i = 0; i < lists.length; i+=2) {
            l1 = lists[i];
            if (i+1 < lists.length) l2 = lists[i+1];
            else l2 = null;

            ListNode res = mergeTwoLists(l1,l2);
            mergedLists.add(res);

        }
        lists = mergedLists.toArray(new ListNode[0]);

    }
        return lists[0];

    }
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
}

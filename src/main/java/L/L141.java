package L;

import X.ListNode;

import java.util.HashSet;
import java.util.Set;

public class L141 {
    public boolean hasCycle(ListNode head) {
        if (head==null)return false;
        Set<ListNode> set= new HashSet<>();
        while (head.next !=null){
            if(set.contains(head))return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}

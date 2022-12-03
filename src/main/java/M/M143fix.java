package M;

import X.ListNode;

import java.util.ArrayList;
import java.util.List;

public class M143fix {
    public static void reorderList(ListNode head) {
        List<Integer> nodes = new ArrayList<>();
        ListNode point = head;
        while (point != null) {
            nodes.add(point.val);
            point = point.next;
        }
        int left = 0;
        int right = nodes.size()-1;

        ListNode res = head;

        while (left<=right){
            res.val = nodes.get(left);
            res = res.next;
            left++;
            if(left<=right) {
                res.val = nodes.get(right);
                res = res.next;
                right--;
            }

        }

        System.out.println("hi");
    }
    public static void main(String[] args) {
        reorderList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))));
    }
}

package M;

import X.TreeNode;

import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class M230 {
    public int kthSmallest(TreeNode root, int k) {
        int res =0;
        SortedSet<Integer> set = new TreeSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            if (node!=null){
                stack.add(node.left);
                stack.add(node.right);
                set.add(node.val);
            }
        }
        for (int i = 0; i < k; i++) {
            int smallest = set.first();
            res = smallest;
            set.remove(smallest);
        }
        return res;
    }

}

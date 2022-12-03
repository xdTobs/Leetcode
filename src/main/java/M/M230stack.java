package M;

import com.sun.source.tree.Tree;

import X.*;
import java.util.Stack;

public class M230stack {
    public int kthSmallest(TreeNode root, int k) {
        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
            TreeNode peek = stack.peek();
            while (peek.left != null) {
                stack.add(peek.left);
                peek = peek.left;
            }
            for (int i = 0; i < k; i++) {
                TreeNode node = stack.pop();
                res = node.val;
                if(node.right!=null){
                    stack.add(node.right);
                    while (node.right.left != null) {
                        stack.add(node.right.left);
                        node.right = node.right.left;
                    }
                }
            }

        return res;
    }
}

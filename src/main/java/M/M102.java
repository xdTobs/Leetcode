package M;

import X.TreeNode;

import java.util.*;

public class M102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> deque = new LinkedList<>();
        if (root == null)return res;
        int level = 1;
        deque.offer(root);
while (!deque.isEmpty()){
    List<Integer> layer = new ArrayList<>();
    int size = deque.size();
    for (int i = 0; i < size; i++) {
        TreeNode node = deque.poll();
        layer.add(node.val);
        if(node.left != null){
            deque.offer(node.left);
        }
        if(node.right != null){
            deque.offer(node.right);
        }
    }
    res.add(layer);
    level++;
}

        return res;
    }
}

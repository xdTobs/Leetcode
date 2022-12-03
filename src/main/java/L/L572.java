package L;

import X.TreeNode;

import java.util.Stack;
import java.util.TreeMap;

public class L572 {
   /* public boolean isSubtree(X.TreeNode root, X.TreeNode subRoot) {
if (root == null)return false;
boolean leftContains = isSubtree(root.left,subRoot);
boolean rightContains = isSubtree(root.right,subRoot);

return (leftContains||rightContains);
    }*/
   public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
       Stack<TreeNode> stack = new Stack<>();
       stack.add(root);
       boolean contains = false;
       while(!stack.empty()){
           TreeNode node = stack.pop();
           if (node!=null) {
               stack.add(node.left);
               stack.add(node.right);
               if (isSameTree(node,subRoot)) contains = true;
           }
       }
       return contains;
   }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val!=q.val) return false;
        boolean isLeftSame = isSameTree(p.left,q.left);
        boolean isRightSame = isSameTree(p.right,q.right);
        return (isRightSame && isLeftSame);
    }
    public static void main(String[] args) {
        System.out.println(isSubtree(new TreeNode(3,new TreeNode(4,new TreeNode(1),new TreeNode(2)),new TreeNode(5)),new TreeNode(4,new TreeNode(1),new TreeNode(2))));
    }
}

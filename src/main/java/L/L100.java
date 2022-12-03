package L;

import X.TreeNode;

public class L100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val!=q.val) return false;
        boolean isLeftSame = isSameTree(p.left,q.left);
        boolean isRightSame = isSameTree(p.right,q.right);
        return (isRightSame && isLeftSame);
    }
}

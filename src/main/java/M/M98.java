package M;

import X.TreeNode;

public class M98 {
    public boolean isValidBST(TreeNode root) {
        if (root==null)return true;
    return(valid(root,null,null));
    }
    public static boolean valid(TreeNode node, Integer min, Integer max){
        if(node==null) return true;

        if (
                (min != null && node.val <= min) || max != null && node.val >= max
        ) {
            return false;
        }
        return valid(node.left,min,node.val)&&valid(node.right,node.val,max);
    }
}

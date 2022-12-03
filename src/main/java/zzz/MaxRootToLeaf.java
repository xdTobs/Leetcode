package zzz;

import X.TreeNode;

public class MaxRootToLeaf {
    public static int maxPath(TreeNode root){
        if (root == null) {
            return 0;
        }
        return Integer.max(maxPath(root.left)+root.val,maxPath(root.right)+root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(11);
        TreeNode b= new TreeNode(4);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(12);

        a.left =b;
        a.right = c;
        root.left = a;
        root.right = d;
        d.right = e;
        System.out.println(maxPath(root));

    }
}

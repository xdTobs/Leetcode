package zzz;

import X.TreeNode;
import com.sun.source.tree.Tree;

public class TreeMinValue {

    public static int minValue(TreeNode root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        return Integer.min(Integer.min(minValue(root.left),minValue(root.right)),root.val);
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
        System.out.println(minValue(root));

    }
}

package M;

import X.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class M235 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
       while(cur!=null){
           if(p.val> cur.val&&q.val>cur.val)cur = cur.right;
           else if (p.val< cur.val&&q.val<cur.val) cur = cur.left;
           else return cur;
       }
       return cur;
    }

    public static void main(String[] args) {
        System.out.println(lowestCommonAncestor(new TreeNode(3,new TreeNode(4,new TreeNode(1),new TreeNode(2)),new TreeNode(5)),new TreeNode(4,new TreeNode(1),new TreeNode(2)),new TreeNode(5)).toString());
    }
}

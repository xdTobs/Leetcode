package S;

import X.TreeNode;

import java.util.*;

public class S297 {
StringBuilder inorder = new StringBuilder();
    public String serialize(TreeNode root) {
        if (root==null) return "a";
    StringBuilder sb = new StringBuilder();
    Stack<TreeNode> stack = new Stack<>();

    stack.add(root);
    while(!stack.empty()){
        TreeNode cur = stack.pop();
        if(cur!=null) {
            sb.append(cur.val);
            sb.append(",");

            stack.add(cur.right);
            stack.add(cur.left);

        }
    }
    sb.deleteCharAt(sb.length()-1);
    sb.append("a");

    //inorder
       inorder(root);
       sb.append(inorder.toString());
        sb.deleteCharAt(sb.length()-1);
inorder = new StringBuilder();
    return sb.toString();
    }

    public void inorder(TreeNode root){
        if (root.left==null && root.right ==null){
            inorder.append(root.val);
            inorder.append(",");
            return;
        }
        else if(root.left == null){
            inorder.append(root.val);
            inorder.append(",");
            inorder(root.right);

        }
        else if(root.right==null){
            inorder(root.left);
            inorder.append(root.val);
            inorder.append(",");

        }
        else{
            inorder(root.left);

            inorder.append(root.val);
            inorder.append(",");

            inorder(root.right);
        }

    }

    public TreeNode deserialize(String data) {
        if (data.length()==1)return null;

        String[]preorderString,inorderString,arrays;
        arrays = data.split("a");
        preorderString = arrays[0].split(",");
        inorderString = arrays[1].split(",");
        int[]inorder = new int[inorderString.length],preorder = new int[preorderString.length];
        for (int i = 0; i < preorderString.length; i++) {
            preorder[i] = Integer.parseInt(preorderString[i]);
        }
        for (int i = 0; i < inorderString.length; i++) {
            inorder[i] = Integer.parseInt(inorderString[i]);
        }
        return buildTree(preorder,inorder);


    }
    int pre = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = preorder[pre++];
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(preorder, left, map.get(rootValue) - 1);
        root.right = helper(preorder, map.get(rootValue) + 1, right);
        return root;
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

        root = new TreeNode(1,new TreeNode(2),new TreeNode(2));
        S297 sol = new S297();
        System.out.println(sol.serialize(root));
        String test = "3,9,20,15,7a9,3,15,20,7";
        String s = sol.serialize(root);
        TreeNode t = sol.deserialize(s);
        System.out.println(t);
    }
}

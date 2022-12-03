package S;


import X.TreeNode;

public class S124 {
int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMaxPathSum(root);
        return maxSum;

    }
    public int findMaxPathSum(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(0,findMaxPathSum(root.left));
        int rightMax = Math.max(0,findMaxPathSum(root.right));
        maxSum = Math.max(maxSum,leftMax+rightMax+root.val);
        return Math.max(leftMax,rightMax)+root.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(-2),new TreeNode(3));
        S124 sol = new S124();
        System.out.println(sol.maxPathSum(root));
    }

}

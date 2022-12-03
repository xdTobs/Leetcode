package S;

import X.TreeNode;

public class S297fix {
    StringBuilder sb = new StringBuilder();
    int i =0;
    public String serialize(TreeNode root) {
    dfs(root);
    if (sb.length()>0){
        sb.deleteCharAt(sb.length()-1);
    }
    return sb.toString();
    }
    public void dfs(TreeNode root){
        if (root == null) {
            sb.append("N");
            sb.append(",");
            return;
        }
        sb.append(root.val);
        sb.append(",");
        dfs(root.left);
        dfs(root.right);
    }

    public TreeNode deserialize(String data) {
    String[] vals = data.split(",");

return dfs(vals);
    }
    public TreeNode dfs(String[] vals){
        if (vals[i].equals("N")){
            i++;
            return null;
        }
        TreeNode res = new TreeNode(Integer.parseInt(vals[i]));
        i++;
        res.left = dfs(vals);
        res.right = dfs(vals);
        return res;
    }
}

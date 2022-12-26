package M;

import X.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class M133 {
    public Node cloneGraph(Node node) {
        if (node==null)return null;

        HashMap<Node,Node> map = new HashMap<>();

        return dfs(map,node);
    }
    public Node dfs(HashMap<Node,Node> map,Node node){
        if (map.containsKey(node))return map.get(node);
        Node copy = new Node(node.val);
        map.put(node,copy);
        for (Node neighbour : node.neighbors){
            copy.neighbors.add(dfs(map,neighbour));
        }
        return copy;
    }
}

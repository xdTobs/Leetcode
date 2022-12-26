package M;

import X.Node;

import java.util.HashMap;
import java.util.HashSet;

public class M207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,Node> courses = new HashMap();
        HashSet<Node> visit = new HashSet<>();
        if (numCourses == 0||prerequisites.length==0){
            return true;
        }
        // numCourses = 5
        // prereq = [[1,0],[3,2],[4,3],[2,4]]
        //[0,1,2,3,4]
        // ^ ^

        //[1,3,4,2,0,3]
        //[0,1,2,3,4,5]

        for (int i = 0; i < numCourses; i++) {
            courses.put(i,new Node(i));

        }
        for (int[] cur : prerequisites) {
            courses.get(cur[0]).neighbors.add(courses.get(cur[1]));
        }
    boolean possibleCourses = true;
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(courses.get(i),visit))
                possibleCourses = false;
        }
        return possibleCourses;

    }
    public boolean dfs(Node node,HashSet<Node> visit){
        visit.add(node);
        if (node.neighbors.size()==0)
            return true;
        if (visit.contains(node))
            return false;
        boolean accesableNode = true;

        for (Node neighbour : node.neighbors){
            if (!dfs(neighbour, visit))
                accesableNode = false;
        }
        return accesableNode;

    }

}

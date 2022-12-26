package M;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class M207fix {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        int[] visit = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());

        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (visit[i] == 0) {
                if (dfs(adj, visit, i))
                    return false;
            }
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> adj, int[] visit, Integer index) {
        if (visit[index] == 2)
            return true;

        visit[index] = 2;

        for (int i = 0; i < adj.get(index).size(); i++) {
            if (visit[adj.get(index).get(i)] != 1) {
                if (dfs(adj, visit, adj.get(index).get(i))) {
                    return true;
                }
            }
        }
        visit[index] = 1;
        return false;
    }

}

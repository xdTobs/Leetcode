package M;

import java.util.ArrayList;
import java.util.List;

public class M39 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0,new ArrayList<>(),0);
        return res;
    }
    public void dfs(int[]candidates,int target,int index, ArrayList<Integer> cur,int sum){
        if (target==sum) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(index >= candidates.length||sum>target)return;


        for (int i = 0; i < candidates.length; i++) {

        }
        cur.add(candidates[index]);
        dfs(candidates,target,index,cur,sum+candidates[index]);
        cur.remove(cur.size()-1);
        dfs(candidates,target,index+1,cur,sum);
    }
}

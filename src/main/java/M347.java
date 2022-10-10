import java.util.*;

public class M347 {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums)map.put(num,map.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b) ->
                        a.getValue() - b.getValue()
        );
for (Map.Entry<Integer,Integer> it : map.entrySet()){
    pq.add(it);
    if (pq.size()>k)pq.poll();

}
int i =k;
while(!pq.isEmpty()){
    res[--i] = pq.poll().getKey();
}
return res;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] temp = topKFrequent(new int[]{4,1,-1,2,-1,2,3},2);
        if (temp.length>0) System.out.println("s");
    }
}

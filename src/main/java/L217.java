import java.util.HashSet;
import java.util.Set;

public class L217 {

    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            if (hashset.contains(nums[i]))return true;
            hashset.add(nums[i]);

        }
        return false;
    }
}

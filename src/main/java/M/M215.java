package M;

public class M215 {
    public static int split(int start, int end, int resID, int[] nums) {
        if (start == end) return nums[start];
        int seperator = nums[end];
        int p = start;
        for (int i = start; i < end; i++) {
            if (nums[i] <= seperator) {
                int temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                p++;
            }

        }
        int temp = nums[end];
        nums[end] = nums[p];
        nums[p] = temp;

        if (resID < p) {
            return split(start, p - 1, resID, nums);
        } else if (resID == p) {
            return nums[p];
        } else {
            return split(p + 1, end, resID, nums);

        }

    }

    public int findKthLargest(int[] nums, int k) {
        return split(0, nums.length - 1, nums.length - k, nums);
    }

}

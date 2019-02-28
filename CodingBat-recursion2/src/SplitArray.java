public class SplitArray {
    public boolean splitArray(int[] nums) {
        return helper(0, nums, 0);
    }

    public boolean helper(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        if (helper(start + 1, nums, target + nums[start])) {
            return true;
        }
        return helper(start + 1, nums, target - nums[start]);
    }

}

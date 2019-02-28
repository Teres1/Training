public class Split53 {
    public boolean split53(int[] nums) {
        return helper(0, nums, 0);
    }

    public boolean helper(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        if (nums[start] % 5 == 0) {
            return helper(start + 1, nums, target + nums[start]);
        }
        if (nums[start] % 3 == 0 && nums[start] % 5 != 0) {
            return helper(start + 1, nums, target - nums[start]);
        }
        if (helper(start + 1, nums, target - nums[start])) {
            return true;
        }
        return helper(start + 1, nums, target + nums[start]);
    }
}

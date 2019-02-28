public class SplitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    public boolean helper(int start, int[] nums, int target1, int target2) {
        if (start >= nums.length) {
            if (target1 % 10 == 0 && target2 % 2 == 1 || target2 % 10 == 0 && target1 % 2 == 1) {
                return true;
            }
            return false;
        }
        if (helper(start + 1, nums, target1 + nums[start], target2)) {
            return true;
        }
        return helper(start + 1, nums, target1, target2 + nums[start]);
    }
}

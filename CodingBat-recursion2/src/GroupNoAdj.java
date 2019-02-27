public class GroupNoAdj {
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }

        if (groupNoAdj(start + 1, nums, target - nums[start])) {
            if (groupNoAdj(start + 2, nums, target - nums[start])) {
                return true;
            }
        }
        return groupNoAdj(start + 1, nums, target);
    }
}

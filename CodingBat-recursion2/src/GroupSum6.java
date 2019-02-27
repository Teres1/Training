public class GroupSum6 {
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (nums[start] % 6 == 0) {

            return groupSum6(start + 1, nums, target - nums[start]);
        }
        return groupSum6(start + 1, nums, target);
    }
}

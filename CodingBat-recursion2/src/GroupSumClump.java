public class GroupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        int i = start + 1;
        if (i < nums.length) {
            while (nums[start] == nums[i]) {
                i++;
            }
        }

        if (groupSumClump(i, nums, target - (i - start) * nums[start])) {
            return true;
        }
        return groupSumClump(i, nums, target);
    }

}

public class Array11 {
    public int array11(int[] nums, int index) {
        int count = 0;
        if (nums.length == 0) {
            return 0;
        }
        if (nums[index] == 11) {
            count++;
        }
        if (index + 1 < nums.length) {
            count += array11(nums, index + 1);
        }
        return count;
    }
}

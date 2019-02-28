import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }


        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum5(start + 1, nums, target);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input[] = rd.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int target = Integer.parseInt(rd.readLine());
        GroupSum5 groupSum5 = new GroupSum5();
        System.out.println(groupSum5.groupSum5(0, arr, target));
    }

}

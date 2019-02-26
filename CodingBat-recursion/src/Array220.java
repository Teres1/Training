import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array220 {
    public boolean array220(int[] nums, int index) {
        if (nums.length == 1 || nums.length == 0) {
            return false;
        }
        if (index + 1 < nums.length) {
            if (nums[index + 1] == 10 * nums[index]) {
                return true;
            }
            return array220(nums, index + 1);
        }
        return false;
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String[]input=rd.readLine().split(" ");
        int nums[]=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i]=Integer.parseInt(input[i]);
        }
        int index=Integer.parseInt(rd.readLine());
        Array220 array220=new Array220();
        System.out.println(array220.array220(nums,index));
    }
}

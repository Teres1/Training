import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
    }
    public static void main(String[]args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String input[]=rd.readLine().split(" ");
        List<Integer>nums=new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            nums.add(Integer.parseInt(input[i]));
        }
        Square sq=new Square();
        System.out.println(sq.square(nums));
    }
}

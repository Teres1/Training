import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(n->n+"*")
                .collect(Collectors.toList());

    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String input[]=rd.readLine().split(" ");
        List<String>nums=new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            nums.add(input[i]);
        }
        AddStar addStar=new AddStar();
        System.out.println(addStar.addStar(nums));
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SMS {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        StringBuilder res = new StringBuilder();
        res.append(input.charAt(0));
        String res2 = "";
        for (int i = 1; i < input.length(); i++) {
            res2 = res.toString();
            res.append(input.charAt(i));
            res.append(res2);
        }
        System.out.println(res.toString());
    }
}

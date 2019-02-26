import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String []array = rd.readLine().split(" ");
        Collections.reverse(Arrays.asList(array));

            System.out.print(String.join(", ",array)) ;

    }
}

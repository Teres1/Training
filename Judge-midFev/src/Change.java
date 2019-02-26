import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Change {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().trim().split(" ");
        BigInteger s = new BigInteger(input[0]);
        BigInteger p=new BigInteger(input[1]);
        System.out.println(s.subtract(p));
    }
}

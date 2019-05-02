import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CrookedStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        BigInteger b1 = BigInteger.valueOf(Long.parseLong(rd.readLine()));
        BigInteger b2 = BigInteger.valueOf(Long.parseLong(rd.readLine()));
        BigInteger b3 = BigInteger.valueOf(Long.parseLong(rd.readLine()));
        int l = Integer.parseInt(rd.readLine());
        BigInteger b4;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(b1 + " ");
                b4=b1.add(b2).add(b3);
                b1=b2;
                b2=b3;
                b3=b4;

            }

            System.out.println();
        }
    }



}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits {
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else return n % 10 + sumDigits(n / 10);
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        SumDigits sd=new SumDigits();
        System.out.println(sd.sumDigits(n));
    }

}

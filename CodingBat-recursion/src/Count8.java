import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count8 {
    public int count8(int n) {
        if (n < 8) {
            return 0;
        }
        if (n % 10 == 8) {
            if (n % 10 == 8 && n % 100 == 88) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }

        return count8(n / 10);
    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(rd.readLine());
        Count8 count8=new Count8();
        System.out.println(count8.count8(n));
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        if (n == 1) {
            System.out.println(0);
        } else {
            int count = 0;
            int i = 0;
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count = i;
                    break;
                }
            }
            if (i > Math.sqrt(n)) {
                System.out.print(n - 1);
            } else {
                System.out.print(n - n / count);
            }
        }
    }
}

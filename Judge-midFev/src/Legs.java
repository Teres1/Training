import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Legs {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int count = 0;
        for (int i = 0; i <= n / 7; i++) {
            for (int j = 0; j <= (n - i * 7) / 2; j++) {
                if ((n - 7 * i - 2 * j) % 5 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

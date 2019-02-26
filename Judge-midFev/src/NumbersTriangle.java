import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

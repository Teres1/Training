import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trapezoid {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        printTrapezoid(n);
    }

    private static void printTrapezoid(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(".");
        }
        for (int i = n; i < 2*n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == n - i||j==2*n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }
        for (int i = 0; i < 2*n; i++) {
            System.out.print("*");
        }
    }
}

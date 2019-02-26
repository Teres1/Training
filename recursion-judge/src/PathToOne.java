import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PathToOne {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        PathToOne pto = new PathToOne();
        System.out.println(pto.countStepsToOne(n) - 1);
    }

    private int countStepsToOne(int n) {
        int count = 1;
        if (n == 1) {
            return count;
        } else {
            if (n % 2 == 0) {
                count = 1 + countStepsToOne(n / 2);
            } else if ((n + 1) % 4 == 0 && n != 3) {
                count = 1 + countStepsToOne(n + 1);
            } else {
                count = 1 + countStepsToOne(n - 1);
            }
        }

        return count;
    }
}

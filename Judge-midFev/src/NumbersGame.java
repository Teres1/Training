import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersGame {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().trim().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        String[] input2 = rd.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }
        int count = 0;
        int[] counter = new int[n];
        int maxCount = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 2; i <= k; i++) {
                if (k % i == 0 && arr[j] % i == 0) {
                    count++;
                    counter[j]++;
                }
                if (maxCount < count) {
                    maxCount = count;
                }
            }
            count = 0;
        }

        if (maxCount == 0) {
            System.out.println("No winners");
        } else {
            System.out.println(maxCount);
            for (int i = 0; i < n; i++) {
                if (counter[i] == maxCount) {
                    System.out.print(i + 1 + " ");
                }
            }
        }
    }
}

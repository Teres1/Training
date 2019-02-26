import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsWithRepetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] arr = new int[k];
        generateCombination(1, 0, k, n, arr);

    }

    private static void generateCombination(int start, int index, int k, int n, int[] arr) {
        if (index == k) {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[index] = i;
            generateCombination(i, index + 1, k, n, arr);
        }
    }
}



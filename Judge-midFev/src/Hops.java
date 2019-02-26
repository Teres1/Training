import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hops {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] fieldInput = rd.readLine().split(", ");
        int[] field = new int[fieldInput.length];
        for (int i = 0; i < field.length; i++) {
            field[i] = Integer.parseInt(fieldInput[i]);
        }
        int m = Integer.parseInt(rd.readLine().trim());
        long maxSum = Integer.MIN_VALUE;
        int[][] matrix = new int[m][];
        for (int i = 0; i < m; i++) {

            String[] inp = rd.readLine().trim().split(", ");
            matrix[i] = new int[inp.length];
            for (int j = 0; j < inp.length; j++) {

                matrix[i][j] = Integer.parseInt(inp[j]);
            }
        }
        for (int i = 0; i < m; i++) {
                boolean[] visited = new boolean[field.length];

                int sum = 0;
                int index = 0;

                while (index >= 0 && index < field.length) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (index == 0 && !visited[0]) {
                            sum += field[0];
                            visited[0] = true;
                        }
                        index += matrix[i][j];
                        if (index < 0 || index >= field.length) {
                            break;
                        }
                        if (visited[index]) {
                            index = field.length;
                            break;
                        }

                        visited[index] = true;
                        sum += field[index];
                    }
                }
                maxSum = Math.max(maxSum, sum);
            }

        System.out.println(maxSum);
    }
}


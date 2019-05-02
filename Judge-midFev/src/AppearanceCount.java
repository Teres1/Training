import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppearanceCount {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        String[] input = rd.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int num = Integer.parseInt(rd.readLine());
        AppearanceCount appearanceCount = new AppearanceCount();
        System.out.println(appearanceCount.appearanceCount(arr, num));
    }

    private int appearanceCount(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
}


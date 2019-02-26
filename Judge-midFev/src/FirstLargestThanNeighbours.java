import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLargestThanNeighbours {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        String[] input = rd.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        FirstLargestThanNeighbours fln=new FirstLargestThanNeighbours();
        System.out.println(fln.returnIndexOfFirstLargestThanNeighbours(arr));
    }

    private int returnIndexOfFirstLargestThanNeighbours(int[] arr) {
        int index ;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}


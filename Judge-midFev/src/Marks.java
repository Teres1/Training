import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Marks {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine().trim());
        String[] firstLine = rd.readLine().trim().split(" ");
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(firstLine[i]);
        }
        Arrays.sort(arr);

        double sum=0;
        for (int i = 1; i < arr.length-1; i++) {
            sum+=arr[i];
        }
            System.out.println((int) Math.round(sum / (arr.length - 2)));

    }
}

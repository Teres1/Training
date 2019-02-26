import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int arr[]=new int[n];
        boolean[]used=new boolean[n];
        Arrays.fill(used,true);
        Permutations pm=new Permutations();
        pm.generatePermutation(0,n,arr,used);
    }

    private void generatePermutation(int start, int n, int[] arr, boolean[] used) {
        if (start == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                used[i] = false;
                arr[start] = i + 1;
                generatePermutation(start + 1, n, arr, used);
                used[i] = true;
            }
        }
    }
}

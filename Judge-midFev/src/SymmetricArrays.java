import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmetricArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = rd.readLine().split(" ");
            if (isSymetric(input)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean isSymetric(String[] arr) {
        if (arr.length == 1) {
            return true;
        } else {
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                if (arr[i].equals(arr[arr.length - 1 - i])) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}



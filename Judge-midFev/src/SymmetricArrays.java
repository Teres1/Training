import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmetricArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = rd.readLine().trim().split(" ");
            SymmetricArrays sa = new SymmetricArrays();
            if(sa.isSymmetric(input)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private boolean isSymmetric(String[]input) {
        if (input.length == 1) {
            return true;
        } else {
            for (int i = 0; i < (input.length + 1) / 2; i++) {
                if (input[i].equals(input[input.length - 1 - i])) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}



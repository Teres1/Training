import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmetricArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int[]arr={1,2,3,2,1};
        SymmetricArrays sa=new SymmetricArrays();
        System.out.println(sa.isTelescopic(arr));
    }

    boolean isTelescopic(int[] a) {
        if (a.length == 1) {
            return true;
        } else {
            for (int i = 0; i < (a.length + 1) / 2; i++) {
                if (a[i]==a[a.length - 1 - i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}



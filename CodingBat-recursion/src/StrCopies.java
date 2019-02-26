import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrCopies {
    public boolean strCopies(String str, String sub, int n) {
        if (n <= 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(1), sub, n - 1);


        }
        return strCopies(str.substring(1), sub, n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str = rd.readLine();
        String sub = rd.readLine();
        int n = Integer.parseInt(rd.readLine());
        StrCopies strCopies = new StrCopies();
        System.out.println(strCopies.strCopies(str, sub, n));
    }
}

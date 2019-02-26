import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrDist {
    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            if (str.substring(str.length() - sub.length(), str.length()).equals(sub)) {
                return str.length();
            }
            return strDist(str.substring(0, str.length() - 1), sub);
        }
        return strDist(str.substring(1), sub);

    }
    public static void main(String[]args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String str=rd.readLine();
        String sub=rd.readLine();
        StrDist strDist=new StrDist();
        System.out.println(strDist.strDist(str,sub));
    }
}
